package com.company;

import java.util.Arrays;

public class Lab03_18_08
{

    public static boolean isConsonant(char ch)
    {
        return !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    public static void main(String[] args)
    {
	    int size = 10;
        char[] symbols = new char[size];
        char ch = 'A';

        for (int i = 0; i < symbols.length; i++) {
            while (!isConsonant(ch))
                ch++;
            symbols[i] = ch++;
        }

        System.out.println("There are symbols in array:");
        System.out.println(Arrays.toString(symbols));
    }
}
