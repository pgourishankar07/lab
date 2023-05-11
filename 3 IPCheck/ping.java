import java.io.*;
import java.net.*;

public class ping {
    public static void main(String[] args) throws UnknownHostException, IOException {
        String ipAddress = "www.google.com";
        InetAddress inet = InetAddress.getByName(ipAddress); // get ipaddress of the domain name given

        System.out.println("Sending Ping Request to " + ipAddress);
        if (inet.isReachable(5000)) { // 5000 is ms time given to reach destinatio within the time
            System.out.println("Host is reachable");
        } else {
            System.out.println("Host is not reachable");
        }
        // ________________________________________________________________________________
        ipAddress = "255.255.255.0";
        inet = InetAddress.getByName(ipAddress);

        System.out.println("Sending Ping Request to " + ipAddress);
        if (inet.isReachable(5000)) {
            System.out.println("Host is reachable");
        } else {
            System.out.println("Host is not reachable");
        }
    }
}
