//package com.company;

public class Lab06_17_08 {

    public static int average(int[] numbers)
    {
        int sum = 0;
        for (int i : numbers)
            sum += i;
        return sum / numbers.length;
    }

    public static void main(String[] args)
    {
	    int[] numbers = { 1, 2, 3, 4, 5 };

	    System.out.println("The input array:");
        for (int i : numbers)
            System.out.println(i);

        int av = average(numbers);
        System.out.printf("\nThe average value: %d\n", av);
    }
}
