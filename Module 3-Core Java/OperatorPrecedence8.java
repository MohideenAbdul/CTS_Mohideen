public class OperatorPrecedence8 {
    public static void main(String[] args) {
        int a=(10+5)*2;
        int b=2+3*4-6/2;

        System.out.println("(10+5)*2="+ b);
        System.out.println("Explanation: Parentheses first: 10+5=15, then 15*2=30\n");

        System.out.println("2+3*4-6/2="+b);
        System.out.println("Explanation: Multiplication and division have higher precedence:3*4=12, 6/2=3, then 2+12-3=11\n");
    }
}
