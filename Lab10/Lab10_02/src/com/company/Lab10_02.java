package com.company;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab10_02 {

    public static void main(String[] args) {
        Scanner inCmd = new Scanner(System.in);
        System.out.print("Enter the new file name =>");
        String fileName = inCmd.nextLine();

        System.out.print("Enter another new file name =>");
        String anotherFileName = inCmd.nextLine();

        try {
            File f1 = new File(fileName);
            f1.createNewFile();

            // only writing
            try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(f1))) {
                for (int i = 0; i < 2; i++) {
                    System.out.format("Enter a string line N %d =>", i + 1);
                    String s = inCmd.nextLine();
                    dataOut.writeUTF(s + "\n");
                }

                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter a double number =>");
                    double d = inCmd.nextDouble();
                    dataOut.writeDouble(d);
                }
                dataOut.flush();
            } catch (InputMismatchException e) {
                System.out.format("Error: %s\n", e.getMessage());
            } catch (IOException e) {
                System.out.format("Error: %s\n", e.getMessage());
            }

            File f2 = new File(anotherFileName);
            f2.createNewFile();

            // reading and writing
            try (DataInputStream dataIn = new DataInputStream(new FileInputStream(f1));
                 DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(f2))) {

                try {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            dataIn.readUTF();
                            continue;
                        }
                        String s = dataIn.readUTF();
                        dataOut.writeUTF(s);
                    }
                    for (int i = 0; i < 5; i++) {
                        double d = dataIn.readDouble();
                        if (d < 0) continue;
                        dataOut.writeDouble(d);
                    }

                } catch (EOFException e) {
                    //
                }
                dataOut.flush();
            } catch (IOException e) {
                System.out.format("Error: %s\n", e.getMessage());
            }

            // only reading
            try (DataInputStream dataIn = new DataInputStream(new FileInputStream(f2))) {
                System.out.println("Reading...");
                System.out.println(dataIn.readUTF());
                while (true)
                    System.out.println(dataIn.readDouble());
            } catch (EOFException e) {
                //
            } catch (IOException e) {
                System.out.format("Error: %s\n", e.getMessage());
            }

        } catch (IOException e) {
            System.out.format("Error: %s\n", e.getMessage());
        }
    }
}
