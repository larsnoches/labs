package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Lab03_18_06
{

    public static void main(String[] args)
    {
        Scanner inCmd = new Scanner(System.in);

	    System.out.println("Enter a size of array:");
	    try {

			int size = inCmd.nextInt();

			if (size == 0) {
				System.out.println("There are wrong size value.");
				return;
			}

			int[] numbers = new int[size];
			Random random = new Random();

			for (int i = 0, n = 0; i < numbers.length; i++) {
				while (n % 5 != 2)
					n++;
				numbers[i] = n++;
			}

			System.out.println("There are array of numbers that could be divided by 5 and get 2 in remainder:");
			System.out.println(Arrays.toString(numbers));

		}
	    catch (java.util.InputMismatchException ex) {
			System.out.println("There are wrong size value.");
		}
	    catch (java.lang.NegativeArraySizeException ex2) {
			System.out.println("There are wrong size value.");
		}
    }
}
