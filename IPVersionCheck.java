package com.mycompany.tuan4;
import java.net.*;

public class IPVersionCheck {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("google.com");
            if (address instanceof Inet4Address) {
                System.out.println("Đay la đia chi IPv4.");
            } else if (address instanceof Inet6Address) {
                System.out.println("Đay la đia chi IPv6.");
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
