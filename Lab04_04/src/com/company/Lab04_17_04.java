//package com.company;

public class Lab04_17_04 {

    public static void main(String[] args) {

        int[][] numbers = new int[10][10];
        for (int y = 0; y < numbers.length; y++) {
            for (int x = 0; x < numbers[y].length; x++) {
                if (x > y) break;
                numbers[y][x] = 1;
            }
        }

        for (int y = 0; y < numbers.length; y++) {
            for (int x = 0; x < numbers[y].length; x++) {
                System.out.print(numbers[y][x] == 1 ? numbers[y][x] : "");
            }
            System.out.print("\n");
        }

    }
}
