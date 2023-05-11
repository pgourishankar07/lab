import java.io.*;
import java.net.*;

public class RemoteCommandClient {
    public static void main(String[] args) throws IOException {
        try {
            Socket client = new Socket("localhost", 6555);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter command : ");
            String str = br.readLine();

            PrintStream ps = new PrintStream(client.getOutputStream());
            ps.println(str);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
