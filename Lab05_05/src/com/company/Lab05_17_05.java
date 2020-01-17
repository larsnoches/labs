package com.company;

public class Lab05_17_05 {

    private int number;

    public Lab05_17_05(int numberValue) {
        setNumber(numberValue);
    }

    public Lab05_17_05() {
        setNumber();
    }

    public void setNumber(int numberValue)
    {
        number = numberValue > 100 ? 100 : numberValue;
    }

    public void setNumber()
    {
        setNumber(0);
    }

    public void checkNumber()
    {
        System.out.printf("The value if number is %d\n", number);
    }

    public static void main(String[] args) {
        Lab05_17_05 lab = new Lab05_17_05(80);
        lab.checkNumber();
    }
}
