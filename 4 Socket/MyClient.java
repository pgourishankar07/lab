import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8080);// creates a new Socket object that connects to the server running
                                                     // on the same machine (localhost) on port 8080.
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());// creates a new DataOutputStream object
                                                                              // that writes data to the output stream
                                                                              // of the Socket object created
            dout.writeUTF("Hello Server"); // write data string
            dout.flush();// flushes the output stream to ensure that all data is sent to the server
            dout.close();// closes the DataOutputStream object to release any resources it was using.
            s.close();// closes the Socket object to release any resources it was using
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}