package com.mycompany.tuan4;
import java.net.*;

public class URLParsing {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/url?sa=i&url=https%3A%2F%2Fvi.m.wikipedia.org%2Fwiki%2FT%25E1%25BA%25ADp_tin%3ALogo_DAI_NAM.png&psig=AOvVaw1Lqcg90Zsv5W_STsNH2s_u&ust=1706144078236000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCLCgkpHo9IMDFQAAAAAdAAAAABAE");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Fragment: " + url.getRef());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
