//package com.company;

import java.util.Scanner;

public class Lab02_18_07 {

    public static void main(String[] args) {
        int num = 0;
        while (num == 0 || (num % 5) != 2 || (num % 7 ) != 1 ) {
            System.out.println("Enter number for check division by 5 and 7 (for example 22):");

            Scanner inCmd = new Scanner(System.in);
            num = inCmd.nextInt();
            if ((num % 5) == 2) {
                System.out.println("Right division by 5");
            }
            if ((num % 7) == 1) {
                System.out.println("Right division by 7");
            }
        }
        System.out.println("You have entered a right number.");
    }
}
