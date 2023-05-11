import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 8000);

        OutputStream os = s.getOutputStream();
        FileInputStream fis = new FileInputStream("input.txt");

        byte[] buffer = new byte[4096];
        int bytesRead = -1;

        while ((bytesRead = fis.read(buffer)) != -1) {
            os.write(buffer, 0, bytesRead);
        }

        os.close();
        fis.close();
        s.close();
    }
}
