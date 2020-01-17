package com.company;

import java.util.Random;

public class Lab04_17_05 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] numbers = new int[3][5];
        int[][] anotherNumbers = new int[5][3];
        for (int y = 0; y < numbers.length; y++) {
            for (int x = 0; x < numbers[y].length; x++) {
                numbers[y][x] = random.nextInt(9);
            }
        }

        // перемещение
        for (int y = 0; y < anotherNumbers.length; y++) {
            for (int x = 0; x < anotherNumbers[y].length; x++) {
                anotherNumbers[y][x] = numbers[x][y];
            }
        }


        // вывод
        // первоначальный массив
        for (int y = 0; y < numbers.length; y++) {
            for (int x = 0; x < numbers[y].length; x++) {
                System.out.print(numbers[y][x]);
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // транспонированный
        for (int y = 0; y < anotherNumbers.length; y++) {
            for (int x = 0; x < anotherNumbers[y].length; x++) {
                System.out.print(anotherNumbers[y][x]);
            }
            System.out.print("\n");
        }

    }
}
