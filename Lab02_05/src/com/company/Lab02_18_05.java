//package com.company;

import java.util.Scanner;

public class Lab02_18_05 {

    public static int getDigit(int num, int whatDigit)
    {
        for (int i = 1; i < whatDigit; i++) {
            num /= 10;
        }
        return num;
    }

    public static void main(String[] args)
    {
        int num = 0;
        System.out.println("Enter number:");
        Scanner inCmd = new Scanner(System.in);
        num = inCmd.nextInt();

        int digit = getDigit(num, 4);
        System.out.format("In the number %d thousands\n", digit);
    }
}
