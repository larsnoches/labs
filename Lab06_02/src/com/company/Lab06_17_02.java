//package com.company;

public class Lab06_17_02 {

    private static int number = 0;

    public static void printNumber()
    {
        System.out.printf("The number value is %d\n", number);
        number++;
    }

    public static void main(String[] args) {
        printNumber();
        printNumber();
    }
}
