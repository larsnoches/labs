package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lab03_18_10
{

    public static void main(String[] args)
    {
	    Scanner inCmd = new Scanner(System.in);

	    System.out.println("Enter an array size:");
	    int size = inCmd.nextInt();

	    int[] numbers = new int[size];
	    Random random = new Random();

	    for (int i = 0; i < numbers.length; i++) {
	        numbers[i] = random.nextInt(200);
        }

	    Arrays.sort(numbers);

		int[] sortedDescNumbers = new int[size];
	    for (int i = 0, n = numbers.length - 1; i < sortedDescNumbers.length; i++, n--) {
			sortedDescNumbers[i] = numbers[n];
		}

	    System.out.println("There are numbers: ");
        System.out.println(Arrays.toString(sortedDescNumbers));
    }
}
