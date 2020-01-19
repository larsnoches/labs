//package com.company;

public class Lab05_17_06 {

    private int min;
    private int max;

    public Lab05_17_06(int firstValue, int secondValue)
    {
        setValues(firstValue, secondValue);
    }

    public Lab05_17_06(int value)
    {
        setValues(value);
    }

    public void setValues(int firstValue, int secondValue)
    {
        if (firstValue > secondValue) {
            if (max != firstValue)
                max = firstValue;
            if (min != secondValue)
                min = secondValue;
        }
        else {
            if (min != firstValue)
                min = firstValue;
            if (max != secondValue)
                max = secondValue;
        }
    }

    public void setValues(int value)
    {
        if (value >= max) {
            max = value;
        }
        else {
            min = value;
        }
    }

    public void printValues() {
        System.out.printf("The max value is %d\n", max);
        System.out.printf("The min value is %d\n", min);
    }

    public static void main(String[] args) {
        Lab05_17_06 lab = new Lab05_17_06(10, 1);
        lab.printValues();
        lab.setValues(5);
        lab.printValues();
    }
}
