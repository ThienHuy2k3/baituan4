package com.mycompany.tuan4;
import java.io.*;
import java.net.*;

public class WebPageReaderAndWriter {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
