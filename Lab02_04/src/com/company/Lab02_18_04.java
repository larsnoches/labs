//package com.company;

import java.util.Scanner;

public class Lab02_18_04 {

    public static void main(String[] args) {
        int num = 0;
        while (num == 0 || !(num >= 5 && num <= 10)) {
            System.out.println("Enter number between 5 and 10:");

            Scanner inCmd = new Scanner(System.in);
            num = inCmd.nextInt();
        }
        System.out.println("You have entered a right number.");
    }
}
