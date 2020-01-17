package com.company;

public class Lab04_17_02 {

    public static void main(String[] args)
    {

        int rows = 10;
        for (int y = 1; y <= rows; y++) {

            for (int x = 0; x < y; x++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }
}
