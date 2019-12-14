package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Lab03_18_05
{

    public static void getSumFor(int count)
    {
        int[] numbers = new int[count];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < count;) {
            int num = random.nextInt(200);
            if (num % 5 == 2 || num % 3 == 1) {
                numbers[i++] = num;
                sum += num;
            }
        }

        System.out.println("There are numbers for sum via operator For:");
        System.out.println(Arrays.toString(numbers));
        System.out.format("The sum of these numbers is: %d\n", sum);
        System.out.print("\n");
    }

    public static void getSumWhile(int count)
    {
        int[] numbers = new int[count];
        Random random = new Random();
        int sum = 0;

        int n = 0;
        while (n < count) {
            int num = random.nextInt(200);
            if (num % 5 == 2 || num % 3 == 1) {
                numbers[n++] = num;
                sum += num;
            }
        }

        System.out.println("There are numbers for sum via operator While:");
        System.out.println(Arrays.toString(numbers));
        System.out.format("The sum of these numbers is: %d\n", sum);
        System.out.print("\n");
    }

    public static void getSumDoWhile(int count)
    {
        int[] numbers = new int[count];
        Random random = new Random();
        int sum = 0;

        int n = 0;
        do {
            int num = random.nextInt(200);
            if (num % 5 == 2 || num % 3 == 1) {
                numbers[n++] = num;
                sum += num;
            }
        }
        while (n < count);

        System.out.println("There are numbers for sum via operator Do-While:");
        System.out.println(Arrays.toString(numbers));
        System.out.format("The sum of these numbers is: %d\n", sum);
        System.out.print("\n");
    }

    public static void main(String[] args)
    {
        Scanner inCmd = new Scanner(System.in);

	    System.out.println("Enter a count of numbers for sum: ");
	    int count = inCmd.nextInt();

        getSumFor(count);
        getSumWhile(count);
        getSumDoWhile(count);
    }
}
