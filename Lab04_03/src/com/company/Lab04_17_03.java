//package com.company;

public class Lab04_17_03 {

    public static void main(String[] args) {

        int[][] numbers = new int[10][15];
        // заполнение
        for (int y = 0; y < numbers.length; y++) {
            for (int x = 0; x < numbers[y].length; x++) {
                numbers[y][x] = 2;
            }
        }

        // вывод
        for (int y = 0; y < numbers.length; y++) {
            for (int x = 0; x < numbers[y].length; x++) {
                System.out.print(numbers[y][x]);
            }
            System.out.print("\n");
        }
    }
}
