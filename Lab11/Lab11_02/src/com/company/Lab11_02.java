package com.company;

import java.io.*;
import java.util.ArrayList;

public class Lab11_02 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("1.txt"), "cp1251"
                ));
             BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(
                             new FileOutputStream("2.txt"), "cp1251")
             )
        ) {
            int lineCount = 0; // counter
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String[] splitted = s.split(" ");
                String firstWord = splitted.length > 0 ? splitted[0].toLowerCase() : "";
                ArrayList<String> words = new ArrayList<>();
                for (String w : splitted) {
                    if (w.isEmpty() || w.length() == 1) continue;
//                    if (w.equals(firstWord)) continue;
                    String lowerW = w.toLowerCase();
                    if (lowerW.charAt(0) == firstWord.charAt(0)) {
                        lowerW = lowerW.replaceAll("[.,]", "");
                        words.add(lowerW);
                    }
                }

                if (words.size() > 1) {
                    System.out.println("Строка " + lineCount + " содержит нужных слов " + words.size());
                    bw.write("Строка " + lineCount + " содержит нужных слов " + words.size());
                    bw.newLine();
                    for (String w : words) {
                        bw.write(lineCount + ": " + w);
                        bw.newLine();
                    }
                    bw.newLine();
                } else {
                    System.out.println("Строка " + lineCount + " не содержит нужных слов");
                }
            }
            bw.flush();
        } catch (IOException e) {
            System.out.format("Error: %s \n", e.getMessage());
        }
    }
}
