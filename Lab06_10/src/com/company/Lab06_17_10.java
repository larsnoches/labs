//package com.company;

import java.util.Arrays;

public class Lab06_17_10 {

    public static int[] minMax(int ... numbers)
    {
        int[] result = new int[2];
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length - 1];

        result[0] = min;
        result[1] = max;

        return result;
    }

    public static void main(String[] args)
    {
	    int[] numbers = { 8, 0, 1, 4, 3, 5 };
        System.out.println("Input array:");
        System.out.print("[");
        for (int i : numbers)
            System.out.printf(" %d ", i);
        System.out.print("]\n");

        System.out.println("\nOutput array:");
	    System.out.print("[");
	    int[] values = minMax(numbers);
	    for (int i : values)
	        System.out.printf(" %d ", i);
        System.out.print("]\n");
    }
}
