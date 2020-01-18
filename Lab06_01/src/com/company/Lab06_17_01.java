//package com.company;

public class Lab06_17_01 {

    char symbol;
    String text;

    public void setValue(char value)
    {
        symbol = value;
    }

    public void setValue(String value)
    {
        text = value;
    }

    public void setValue(char[] value)
    {
        if (value.length == 1) {
            symbol = value[0];
        }
        else if (value.length > 1) {
            text = new String(value);
        }
    }

    public void printValues()
    {
        System.out.printf("The symbol is %c\n", symbol);
        System.out.printf("The text is %s\n\n", text);
    }

    public static void main(String[] args) {
        Lab06_17_01 lab = new Lab06_17_01();
        lab.setValue('A');
        lab.printValues();

        lab.setValue("abc");
        lab.printValues();

        char[] charArray = {'e', 'f', 'g'};
        lab.setValue(charArray);
        lab.printValues();

        char[] charOne = {'e'};
        lab.setValue(charOne);
        lab.printValues();
    }
}
