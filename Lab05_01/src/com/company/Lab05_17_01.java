//package com.company;

public class Lab05_17_01 {

    private char symbol;

    public void setSymbol(char sym)
    {
        symbol = sym;
    }

    public int getSymbol()
    {
        return (int)symbol;
    }

    public void printSymbol()
    {
        System.out.printf("Symbol is %c\n", getSymbol());
        System.out.printf("Symbol code is %d\n", (int)getSymbol());
    }

    public static void main(String[] args)
    {
        Lab05_17_01 lab = new Lab05_17_01();
        lab.setSymbol('P');
        lab.printSymbol();
    }
}
