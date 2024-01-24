
package com.mycompany.tuan4;
import java.net.*;

public class ServerInfo {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("google.com");
            System.out.println("Đia chi IP cua may chu google.com: " + address.getHostAddress());
            System.out.println("Ten may chu: " + address.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
