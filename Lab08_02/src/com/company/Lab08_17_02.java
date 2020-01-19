package com.company;

import java.util.Scanner;

public class Lab08_17_02 {

    public static byte[] convertToBin(int number)
    {
        int scale = 2;
        byte[] result = new byte[number / scale + 1];
        recursiveMod(number, scale, result, 0);
        return reverse(result);
    }

    public static byte[] recursiveMod(int number, int scale, byte[] result, int pos)
    {
        if (number >= scale) {
            result[pos] = (byte)(number % scale);
            return recursiveMod(number /= scale, scale, result, ++pos);
        }
        result[pos] = (byte)number;
        return result;
    }

    public static byte[] reverse(byte[] input)
    {
        byte[] output = new byte[input.length];
        for (int i = input.length - 1, t = 0; i > 0; i--, t++) {
            output[t] = input[i];
            output[t] = input[i];
        }
        return output;
    }

    public static void main(String[] args)
    {
	    Scanner inCmd = new Scanner(System.in);

	    System.out.println("Enter number to convert: ");
        int number = inCmd.nextInt();

        byte[] convertedNumber = convertToBin(number);
        System.out.println("Converted number is:");
        for (byte b : convertedNumber) {
            System.out.print(b);
        }
        System.out.print("\n");
    }
}
