package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Lab03_18_03
{

    public static void FibonacciFor(int length)
    {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            if (i <= 1)
                numbers[i] = 1;
            else
                numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        System.out.println("Generated via operator For:");
        System.out.println(Arrays.toString(numbers));
    }

    public static void FibonacciWhile(int length)
    {
        int[] numbers = new int[length];
        int counter = -1;
        while (++counter < length) {
            if (counter <= 1)
                numbers[counter] = 1;
            else
                numbers[counter] = numbers[counter - 1] + numbers[counter - 2];
        }
        System.out.println("Generated via operator While:");
        System.out.println(Arrays.toString(numbers));
    }

    public static void FibonacciDoWhile(int length)
    {
        int[] numbers = new int[length];
        int counter = 0;
        do {
            if (counter <= 1)
                numbers[counter] = 1;
            else
                numbers[counter] = numbers[counter - 1] + numbers[counter - 2];
        }
        while (++counter < length);
        System.out.println("Generated via operator Do-While:");
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args)
    {
        System.out.println("Enter length of fibonacci sequence");
        Scanner inCmd = new Scanner(System.in);

        int targetLength = inCmd.nextInt();
        FibonacciFor(targetLength);
        FibonacciWhile(targetLength);
        FibonacciDoWhile(targetLength);
    }
}
