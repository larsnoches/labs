package com.company;

public class Lab05_17_02 {

    private char symbol1 = 'A';
    private char symbol2 = 'D';

    public void printResult()
    {
        char ch = symbol1;
        do {
            System.out.printf(" %c ", ch);
        }
        while (ch++ != symbol2);
        System.out.println("");
    }

    public static void main(String[] args)
    {
        Lab05_17_02 lab = new Lab05_17_02();
        lab.printResult();
    }
}
