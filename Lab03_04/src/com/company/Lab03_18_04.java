package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Lab03_18_04
{

    public static void showNumbersFor(int[] numbers)
    {
        System.out.println("There are numbers from lower, via operator For:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void showNumbersWhile(int[] numbers)
    {
        System.out.println("There are numbers from lower, via operator While:");
        int counter = -1;
        while (++counter < numbers.length) {
            System.out.println(numbers[counter]);
        }
    }

    public static void showNumbersDoWhile(int[] numbers)
    {
        System.out.println("There are numbers from lower, via operator Do-While:");
        int counter = 0;
        do {
            System.out.println(numbers[counter]);
        }
        while (++counter < numbers.length);
    }

    public static void main(String[] args)
    {
        Scanner inCmd = new Scanner(System.in);

	    System.out.println("Enter a first number:");
	    int firstNumber = inCmd.nextInt();

	    System.out.println("Enter a second number:");
	    int secondNumber = inCmd.nextInt();

        int[] numbers = new int[2];
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
	    Arrays.sort(numbers);

        showNumbersFor(numbers);
        showNumbersWhile(numbers);
        showNumbersDoWhile(numbers);
    }
}
