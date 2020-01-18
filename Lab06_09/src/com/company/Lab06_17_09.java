//package com.company;

public class Lab06_17_09 {

    public static void moveElements(char[] symbols)
    {
        System.out.print("\nIn progress:\n");
        for (int i = 0, t = symbols.length - 1; i < symbols.length; i++, t--) {
            if (i == t)
                break;
            char sym = symbols[i];
            symbols[i] = symbols[t];
            symbols[t] = sym;

            System.out.print("[");
            for (char ch : symbols)
                System.out.printf(" %c ", ch);
            System.out.print("]\n");
        }
    }

    public static void main(String[] args)
    {
	    char[] symbols = { 'A', 'B', 'C', 'D', 'E' };

	    System.out.println("The input array:");
        System.out.print("[");
	    for (char ch : symbols)
	        System.out.printf(" %c ", ch);
        System.out.print("]\n");

        moveElements(symbols);

        System.out.println("\nThe moved elements array:");
        System.out.print("[");
        for (char ch : symbols)
            System.out.printf(" %c ", ch);
        System.out.print("]\n");
    }
}
