//package com.company;

import java.util.Scanner;

public class Lab02_18_10
{

    public static int getDigit(int num)
    {
        return (num & 56) >> 3;
    }

    public static void main(String[] args)
    {
        int num = 0;
        System.out.println("Enter number:");
        Scanner inCmd = new Scanner(System.in);
        num = inCmd.nextInt();

        int digit = getDigit(num);
        System.out.format("The second digit from right in oct is %d\n", digit);

    }
}
