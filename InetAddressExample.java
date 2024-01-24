
package com.mycompany.tuan4;
import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Dia chi IP cua may: " + address.getHostAddress());
            System.out.println("Ten may: " + address.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
