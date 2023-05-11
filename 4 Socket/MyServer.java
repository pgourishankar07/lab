import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080); // creates new server on port 8080

            Socket s = ss.accept();// waits until a client connects to the server and returns a new Socket object
                                   // representing the connection to the client. establishes connection

            DataInputStream dis = new DataInputStream(s.getInputStream()); // creates a new DataInputStream object that
                                                                           // reads data from the input stream of the
                                                                           // Socket object
            String str = (String) dis.readUTF(); // reads string message from client
            System.out.println("message= " + str);
            ss.close(); // closes the ServerSocket object to release the port that it was listening on
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}