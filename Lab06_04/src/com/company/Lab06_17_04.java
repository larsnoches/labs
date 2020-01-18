//package com.company;

public class Lab06_17_04 {

    public static int recursiveFactorial2(int num)
    {
        if (num == 1 || num == 2)
            return num;
        return num * recursiveFactorial2(num - 2);
    }

    public static int simpleFactorial2(int num)
    {
        int f2 = 1;
        if (num % 2 == 0) {
            for (int i = 2; i <= num; i += 2) {
                f2 *= i;
            }
        }
        else {
            for (int i = 1; i <= num; i += 2) {
                f2 *= i;
            }
        }
        return f2;
    }

    public static void main(String[] args)
    {
        int param1 = 5;
        int f2Recursive = recursiveFactorial2(param1);
        System.out.printf("%d!! = %d\n", param1, f2Recursive);

        int param2 = 6;
        int f2Simple = simpleFactorial2(param2);
        System.out.printf("%d!! = %d\n", param2, f2Simple);
    }
}
