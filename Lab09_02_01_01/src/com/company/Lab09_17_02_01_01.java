package com.company;

import java.util.Scanner;

public class Lab09_17_02_01_01 {

    public static void readInputArray(Scanner inCmd, int[] numbers, int pos) throws
            java.util.InputMismatchException
    {
        if (pos < numbers.length) {
            numbers[pos] = inCmd.nextInt();
            readInputArray(inCmd, numbers, ++pos);
        }
    }

    public static int average(int[] numbers)
    {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        try {
            Scanner inCmd = new Scanner(System.in);

            System.out.println("Enter a size of digit array:");
            int count = inCmd.nextInt();

            int[] numbers = new int[count];
            System.out.println("Enter a digit array:");
            readInputArray(inCmd, numbers, 0);

            int averageValue = average(numbers);
            System.out.printf("An average value is %d \n", averageValue);
        }
        catch(java.util.InputMismatchException e) {
            System.out.println("Only digits allowed to enter.");
        }
        catch(NegativeArraySizeException e) {
            System.out.println("Array size must be positive.");
        }
    }
}
