package com.company;

public class Rec5 {
    public static int step = 0;

    public static int f(int n)
    {
        int result = 0;
        space();
        step++;
        System.out.printf("fib %d -> \n", n);
        if (n == 0 || n == 1) {
            result = n;
        }
        else {
            result = f(n - 2) + f(n - 1);
        }
        step--;
        space();
        System.out.printf("<- fib %d\n", n);
        return result;
    }

    public static void space()
    {
        for (int i = 0; i < step; i++)
            System.out.print("-");
    }

    public static void m(int n)
    {
        System.out.println("Fibbo tree: ");
        f(n);
        System.out.print("\n");
    }
}
