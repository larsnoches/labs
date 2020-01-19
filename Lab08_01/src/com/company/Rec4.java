package com.company;

public class Rec4 {
    public static int fact(int n)
    {
        int result;

        if (n == 1) {
            return n;
        }
        else {
            result = n * fact(n - 1);
            return result;
        }
    }

    public static void m(int n)
    {
        System.out.printf("%d!=%d\n", n, fact(n));
    }
}
