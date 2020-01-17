package com.company;

import java.util.Random;

public class Lab04_17_06 {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] numbers = new int[5][4];

        // заполнение
        for (int y = 0; y < numbers.length; y++) {

            for (int x = 0; x < numbers[y].length; x++) {
                numbers[y][x] = random.nextInt(9);
                System.out.print(numbers[y][x]);
            }
            System.out.print("\n");

        }
        System.out.print("\n");

        // исключение
        int anotherRowCount = numbers.length - 1;
        int anotherColumnCount = numbers[0].length - 1;

        int[][] anotherNumbers = new int[anotherRowCount][anotherColumnCount];
        int skipRow = random.nextInt(anotherRowCount);
        int skipColumn = random.nextInt(anotherColumnCount);

        System.out.printf("The row to skip is %d\n", skipRow + 1);
        System.out.printf("The column to skip is %d\n\n", skipColumn + 1);

        for (int y = 0; y < numbers.length; y++) {

            if (y == skipRow)
                continue;

            int anotherY = y > skipRow ? (y - 1) : y;

            for (int x = 0; x < numbers[y].length; x++) {
                if (x == skipColumn)
                    continue;

                int anotherX = x > skipColumn ? (x - 1) : x;

                anotherNumbers[anotherY][anotherX] = numbers[y][x];
                System.out.print(anotherNumbers[anotherY][anotherX]);
            }
            System.out.print("\n");

        }

    }
}
