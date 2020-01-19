//package com.company;

import java.util.Scanner;

public class Lab02_18_01 {

    public static void main(String[] args)
    {
        int num = 0;
        while (num == 0 || (num % 3) != 0) {
            System.out.println("Enter number for division by 3:");

            Scanner inCmd = new Scanner(System.in);
            num = inCmd.nextInt();
        }
        System.out.println("You have entered a right number.");
    }
}
