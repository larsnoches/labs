package com.company;

import java.io.*;
import java.util.ArrayList;

public class Lab10_03 {

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
                ArrayList<String> words = new ArrayList<>();
                for (String w : s.split(" ")) {
                    if (w.isEmpty() || w.length() == 1) continue;
                    String lowerW = w.toLowerCase();
                    if (!lowerW.matches("^(?ui:[аеёиоуыэюя]).*")) {
                        lowerW = lowerW.replaceAll("[.,]", "");
                        System.out.println(lowerW);
                        words.add(lowerW);
                    }
                }

                if (!words.isEmpty()) {
                    bw.write("Строка " + lineCount + " содержит нужных слов " + words.size());
                    bw.newLine();
                    for (String w : words) {
                        bw.write(lineCount + ": " + w);
                        bw.newLine();
                    }
                    bw.newLine();
                }
            }
            bw.flush();
        } catch (IOException e) {
            System.out.format("Error: %s \n", e.getMessage());
        }
    }
}
