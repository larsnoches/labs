//package com.company;

import java.util.Scanner;

public class Lab02_18_03 {

    public static void main(String[] args) {
        int num = 0;
        while (num == 0 || (num % 4) != 0 || num < 10) {
            System.out.println("Enter number for division by 4 and not less 10:");

            Scanner inCmd = new Scanner(System.in);
            num = inCmd.nextInt();
            if ((num % 4) == 0) {
                System.out.println("Number could be divide by 4");
            }
            if (num >= 10) {
                System.out.println("Number not less 10");
            }
        }
        System.out.println("You have entered a right number.");
    }
}
