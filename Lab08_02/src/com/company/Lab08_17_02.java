package com.company;

import java.util.Scanner;

public class Lab08_17_02 {

    public static String toBinaryString(int num) {
        return num > 0 ? toBinaryString(num / 2) + String.valueOf(num % 2) : "";
    }

    public static void main(String[] args)
    {
	    Scanner inCmd = new Scanner(System.in);
	    System.out.println("Enter number to convert: ");
        int number = inCmd.nextInt();

        System.out.println(toBinaryString(number));
    }
}
