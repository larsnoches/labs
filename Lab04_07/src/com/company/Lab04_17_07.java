//package com.company;

public class Lab04_17_07 {

    static int counter = 0;

    public static void putNumbersToRow(int[][] target, int row, int boundColumn)
    {
        if (row >= target.length)
            return;

        for (int x = 0; x < target[row].length; x++) {
            if (x >= boundColumn)
                break;
            target[row][x] = counter++;
        }
    }

    public static void putNumbersToColumn(int[][] target, int column, int boundRow)
    {
        for (int y = target.length - 1; y > 0; y--) {
            if (column >= target[y].length)
                break;
            if (y <= boundRow)
                break;
            target[y][column] = counter++;
        }
    }

    public static void printNumbers(int[][] target)
    {
        for (int y = 0; y < target.length; y++) {

            for (int x = 0; x < target[y].length; x++) {
                int num = target[y][x];
                System.out.printf(num / 10 == 0 ? "   %d" : "  %d", num);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        int[][] numbers = new int[4][5];

        int lastRow = numbers.length - 1;
        int lastColumn = numbers[lastRow].length - 1;

        for (int y = 0, x = lastColumn; y < numbers.length; y++, x--) {
            putNumbersToRow(numbers, y, x + 1);
            if (x > 0)
                putNumbersToColumn(numbers, x, y);

            printNumbers(numbers);
        }

    }
}
