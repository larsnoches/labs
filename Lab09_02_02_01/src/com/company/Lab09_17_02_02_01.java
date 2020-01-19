package com.company;

import java.util.Scanner;

public class Lab09_17_02_02_01 {

    public static int[][] createMatrix(int rows, int columns)
    {
        int[][] matrix = new int[rows][columns];
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                matrix[y][x] = x * y;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix)
    {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                System.out.print(matrix[y][x] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        try {
            int rows = 4;
            int columns = 3;
            int[][] matrix = createMatrix(rows, columns);
            printMatrix(matrix);

            Scanner inCmd = new Scanner(System.in);
            System.out.println("Enter a column number:");
            int targetColumn = inCmd.nextInt();

            int[] column = new int[rows];

            for (int y = 0; y < rows; y++) {
                for (int x = 0; x < columns; x++) {
                    if (x == targetColumn) {
                        column[y] = matrix[y][x];
                        break;
                    }
                }
            }

            System.out.println("Selected column is: ");
            for (int i : column) {
                System.out.println(i);
            }
        }
        catch(java.util.InputMismatchException e) {
            System.out.println("Only digits allowed to enter.");
        }
        finally {
            System.out.println("Good bye!");
        }

    }
}
