//package com.company;

public class Lab06_17_07 {

    public static int[] convert(char[] symbols)
    {
        int[] result = new int[symbols.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int)symbols[i];
        }
        return result;
    }

    public static void main(String[] args)
    {
	    char[] symbols = { 'A', 'B', 'C', 'D', 'E' };
	    int[] codes = convert(symbols);

        System.out.println("The input array: ");
	    for (char ch : symbols)
	        System.out.println(ch);

        System.out.println("\nThe output array: ");
        for (int i : codes)
            System.out.println(i);
    }
}
