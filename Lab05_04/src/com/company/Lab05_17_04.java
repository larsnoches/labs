package com.company;

public class Lab05_17_04 {

    char symbol;
    int number;

    public Lab05_17_04(char symbolValue, int numberValue) {
        symbol = symbolValue;
        number = numberValue;

        System.out.printf("The symbol is %c\n", symbol);
        System.out.printf("The number is %d\n", number);
    }

    public Lab05_17_04(double arg) {
        int part1 = (int)(arg);
        int part2 = (int)((arg % 1.0) * 100.0);

        symbol = (char)part1;
        number = part2;

        System.out.printf("The symbol is %c\n", symbol);
        System.out.printf("The number is %d\n", number);
    }

    public static void main(String[] args) {
        Lab05_17_04 lab = new Lab05_17_04(65.1267);
    }
}
