
package com.mycompany.tuan4;
import java.io.*;
import java.net.*;

public class WebPageReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
