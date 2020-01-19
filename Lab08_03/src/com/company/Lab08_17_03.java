package com.company;

import java.util.Scanner;

public class Lab08_17_03 {

    public static void setArray(int[] numbers, int pos)
    {
        if (pos < numbers.length) {
            numbers[pos] = pos + 1;
            setArray(numbers, ++pos);
        }
    }

    public static void printArray(int[] numbers, int pos)
    {
        if (pos < numbers.length) {
            System.out.println(numbers[pos]);
            printArray(numbers, ++pos);
        }
    }

    public static void main(String[] args) {
	    Scanner inCmd = new Scanner(System.in);
        System.out.println("Enter array size: ");

        int size = inCmd.nextInt();
        int[] numbers = new int[size];

        setArray(numbers, 0);

        System.out.println("The output array: ");
        printArray(numbers, 0);
    }
}
