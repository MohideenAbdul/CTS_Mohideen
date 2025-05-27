import java.sql.*;

public class TransactionHandling {
    public static void transferMoney(Connection conn, int fromAcc, int toAcc, double amount) throws SQLException {
        try {
            conn.setAutoCommit(false);
            try (PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                 PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {
                debit.setDouble(1, amount);
                debit.setInt(2, fromAcc);
                debit.executeUpdate();

                credit.setDouble(1, amount);
                credit.setInt(2, toAcc);
                credit.executeUpdate();

                conn.commit();
                System.out.println("Transfer successful.");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transfer failed, transaction rolled back.");
                throw e;
            }
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            transferMoney(conn, 1, 2, 100.0);
        }
    }
}
