package com.company;

import java.util.Scanner;

public class Lab09_17_02_01_02 {

    public static void readInputArray(Scanner inCmd, int[] numbers, int pos) throws
            java.util.InputMismatchException, RuntimeException
    {
        if (pos < numbers.length) {
            int value = inCmd.nextInt();
            if (value < 0) {
                throw new RuntimeException("Only positive values allowed");
            }
            if (value > Integer.MAX_VALUE) {
                throw new RuntimeException("Integer type error");
            }
            numbers[pos] = value;
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
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Good bye!");
        }
    }
}
