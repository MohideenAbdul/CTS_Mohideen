import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (true) {
            System.out.print("Client: ");
            String msg = userInput.readLine();
            out.println(msg);
            if ("bye".equalsIgnoreCase(msg)) break;
            line = in.readLine();
            System.out.println("Server: " + line);
        }
        socket.close();
    }
}
