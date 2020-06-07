package com.company;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Lab10_01_02 {

    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // 1 byte
            if (oneByte != -1) { // end of file
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
	    try {
	        // file
            InputStream inFile = new FileInputStream("text.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            // internet-page
            InputStream inUrl = new URL("https://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            // byte array
            InputStream inArray = new ByteArrayInputStream(new byte [] {7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        } catch (IOException e) {
	        System.out.println("Ошибка: " + e);
        }
    }
}
