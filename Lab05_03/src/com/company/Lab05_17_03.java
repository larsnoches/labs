package com.company;


public class Lab05_17_03 {

    private int prop1;
    private int prop2;

    public Lab05_17_03()
    {
        this.prop1 = 1;
        this.prop2 = 2;
        System.out.printf("Property values are: %d and %d\n", this.prop1, this.prop2);
    }

    public Lab05_17_03(int prop1Value)
    {
        this.prop1 = prop1Value;
        this.prop2 = 2;
        System.out.printf("Property values are: %d and %d\n", this.prop1, this.prop2);
    }

    public Lab05_17_03(int prop1Value, int prop2Value)
    {
        this.prop1 = prop1Value;
        this.prop2 = prop2Value;
        System.out.printf("Property values are: %d and %d\n", this.prop1, this.prop2);
    }

    public static void main(String[] args)
    {
        Lab05_17_03 lab = new Lab05_17_03();
        Lab05_17_03 labParam1 = new Lab05_17_03(3);
        Lab05_17_03 labParam1and2 = new Lab05_17_03(4, 5);
    }
}
