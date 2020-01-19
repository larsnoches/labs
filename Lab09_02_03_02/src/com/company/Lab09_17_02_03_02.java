package com.company;

import java.util.Scanner;

public class Lab09_17_02_03_02 {

    public static void readInputArray(Scanner inCmd, byte[] bytes, int pos) throws
            java.util.InputMismatchException, RuntimeException
    {
        if (pos < bytes.length) {
            int value = inCmd.nextInt();
            if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
                throw new RuntimeException("Out of range.");
            }
            bytes[pos] = (byte)value;
            readInputArray(inCmd, bytes, ++pos);
        }
    }

    public static int sumOf(byte[] bytes)
    {
        int sum = 0;
        for (byte b : bytes) {
            sum += b;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        try {
            Scanner inCmd = new Scanner(System.in);
            System.out.println("Enter a size of bytes array:");
            int count = inCmd.nextInt();

            byte[] bytes = new byte[count];
            System.out.println("Enter a byte array:");
            readInputArray(inCmd, bytes, 0);

            int sum = sumOf(bytes);
            System.out.printf("The sum of array elements is: %d\n", sum);
        }
        catch(java.util.InputMismatchException e) {
            System.out.println("Only bytes allowed to enter.");
        }
        catch(NegativeArraySizeException e) {
            System.out.println("Array size must be positive.");
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Good bye!");
        }
    }
}
