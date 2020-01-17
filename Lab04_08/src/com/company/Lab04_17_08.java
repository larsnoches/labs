package com.company;

import java.util.Scanner;

public class Lab04_17_08 {

    public static String makeEncryption(String target, int key)
    {
        char[] encrypted = new char[target.length()];
        for (int i = 0; i < target.length(); i++) {
            int code = target.charAt(i) + key;
            encrypted[i] = (char)code;
        }
        return new String(encrypted);
    }

    public static String makeDecryption(String target, int key)
    {
        char[] encrypted = new char[target.length()];
        for (int i = 0; i < target.length(); i++) {
            int code = target.charAt(i) - key;
            encrypted[i] = (char)code;
        }
        return new String(encrypted);
    }

    public static void main(String[] args)
    {
        Scanner inCmd = new Scanner(System.in);

        try {
            System.out.println("Enter text to encrypt (Введите текст для шифрования):");
            String text = inCmd.nextLine();

            System.out.println("Enter key (Введите ключ):");
            int key = inCmd.nextInt();

            String encryptedText = makeEncryption(text, key);
            System.out.printf("Encrypted text:\n%s\n", encryptedText);

            Scanner answerInCmd = new Scanner(System.in);
            String answer;
            boolean running = true;
            while (running) {
                System.out.println("Make a decryption[y/n]? (Сделать обратное преобразование[y/n]? ):");
                answer = answerInCmd.nextLine();

                switch(answer) {
                    case "y":
                        String decryptedText = makeDecryption(encryptedText, key);
                        System.out.printf("Decrypted text:\n%s\n", decryptedText);
                        running = false;
                        break;
                    case "n":
                        System.out.println("Good bye! (До свидания!)");
                        running = false;
                        break;
                    default:
                        System.out.println("Enter a correct answer (Введите корректный ответ).");
                }
            }
        }
        catch (RuntimeException ex) {
            System.out.println("Error");
        }

    }
}
