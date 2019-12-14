package com.company;

import java.util.Arrays;

public class Lab03_18_07
{

    public static void main(String[] args)
    {
        int size = 10;
        char[] abc = new char[size];
        char ch = 'a'; // english
//        char ch = 'а'; // russian

        for (int i = 0; i < abc.length; i++) {
            abc[i] = ch++;
            ch++;
        }

	    System.out.println("The are array of symbols:");
        System.out.println(Arrays.toString(abc));

        char[] cba = new char[size];
        for (int i = 0, n = abc.length - 1; i < cba.length; i++, n--) {
            cba[i] = abc[n];
        }

        System.out.println("The are reversed array of symbols:");
        System.out.println(Arrays.toString(cba));
    }
}
