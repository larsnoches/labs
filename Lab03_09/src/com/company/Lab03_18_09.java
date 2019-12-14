package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Lab03_18_09
{

    public static void main(String[] args)
    {
        Scanner inCmd = new Scanner(System.in);
        System.out.println("Enter a size of array:");

        Random random = new Random();
        int size = inCmd.nextInt();
        int[] numbers = new int[size];

	    for (int i = 0; i < numbers.length; i++) {
	        numbers[i] = random.nextInt(200);
        }

	    Arrays.sort(numbers);
        System.out.println("There are numbers:");
	    System.out.println(Arrays.toString(numbers));

	    int minimalValue = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (minimalValue == -1 && numbers[i] > minimalValue) {
                minimalValue = numbers[i];
                System.out.format("The minimal value is %d at index %d\n", minimalValue, i);
            }
            else if (minimalValue > -1 && numbers[i] == minimalValue) {
                System.out.format("Another item with minimal value at index %d\n", i);
            }
        }
    }
}
