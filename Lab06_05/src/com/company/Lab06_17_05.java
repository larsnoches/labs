//package com.company;

public class Lab06_17_05 {

    public static int simplePowSum(int num)
    {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i * i;
//            System.out.printf("%d^2\n", i);
        }
        return result;
    }

    public static int recursivePowSum(int num)
    {
//        System.out.printf("%d^2\n", num);
        if (num <= 1)
            return 1;
        return (num * num) + recursivePowSum((num - 1));
    }

    public static void check(int target, int num)
    {
        int result = (target * (target + 1) * (2 * target + 1)) / 6;
        if (result == num)
            System.out.printf("True sum\n");
        else
            System.out.printf("False sum\n");
    }

    public static void main(String[] args)
    {
        int arg1 = 8;
        int powSum1 = simplePowSum(arg1);
        System.out.printf("The result for %d is %d\n", arg1, powSum1);
        check(arg1, powSum1);

        int arg2 = 8;
        int powSum2 = recursivePowSum(arg2);
        System.out.printf("The result for %d is %d\n", arg2, powSum2);
        check(arg2, powSum2);
    }
}
