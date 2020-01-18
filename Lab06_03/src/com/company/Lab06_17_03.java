//package com.company;

import java.util.Arrays;

public class Lab06_17_03 {

    public static void minValue(int ... values)
    {
        int min = 0;
        int[] sorted = values.clone();
        Arrays.sort(sorted);
        if (sorted.length > 0)
            min = sorted[0];
        System.out.printf("The min value is %d\n", min);
    }

    public static void maxValue(int ... values)
    {
        int max = 0;
        int[] sorted = values.clone();
        Arrays.sort(sorted);
        if (sorted.length > 0)
            max = sorted[sorted.length - 1];
        System.out.printf("The max value is %d\n", max);
    }

    public static void averageValue(int ... values)
    {
        int sum = 0;
        for (int i : values)
            sum += i;
        int average = sum / values.length;
        System.out.printf("The average value is %d\n", average);
    }

    public static void main(String[] args) {
	    int[] numbers = { 2, 0, 10, 5, 1 };
	    minValue(numbers);
        maxValue(numbers);
        averageValue(numbers);
    }
}
