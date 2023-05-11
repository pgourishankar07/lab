import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8000);
        Socket socket = server.accept();

        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("output.txt");

        byte[] buffer = new byte[4096];
        int bytesRead = -1;

        while ((bytesRead = is.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fos.close();
        socket.close();
        server.close();
    }
}
