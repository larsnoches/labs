//package com.company;

public class Lab06_17_06 {

    public static int[] cutArray(int[] numbers, int bound)
    {
        if (bound > numbers.length)
            return numbers.clone();
        int[] result = new int[bound];
        for (int i = 0; i < bound; i++) {
            result[i] = numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
	    int[] nums = { 1, 2, 3, 4, 5 };
	    int[] cutted = cutArray(nums, 3);

        System.out.println("The input array: ");
        for (int i : nums)
            System.out.println(i);

        System.out.println("\nThe cutted array: ");
        for (int i : cutted)
            System.out.println(i);
    }
}
