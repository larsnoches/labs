package com.company;

import java.io.*;

public class Lab10_01_07 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            // creation of file symbol stream
            br = new BufferedReader(new FileReader("E:\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("E:\\MyFile2.txt"));

            int lineCount = 0; // counter
            String s;
            // file > file
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ":" + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
