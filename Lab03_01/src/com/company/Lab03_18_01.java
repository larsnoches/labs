package com.company;

import java.util.Scanner;

public class Lab03_18_01
{

    public static void main(String[] args)
    {
        System.out.println("Enter a week day number:");

        Scanner inCmd = new Scanner(System.in);
        int weekDayNumber = inCmd.nextInt();
        String weekDayName = new String();

        switch(weekDayNumber) {
            case 1:
                weekDayName = "monday (понедельник)";
                break;
            case 2:
                weekDayName = "tuesday (вторник)";
                break;
            case 3:
                weekDayName = "wednesday (среда)";
                break;
            case 4:
                weekDayName = "thursday (четверг)";
                break;
            case 5:
                weekDayName = "friday (пятница)";
                break;
            case 6:
                weekDayName = "saturday (суббота)";
                break;
            case 7:
                weekDayName = "sunday (воскресенье)";
                break;
            default:
                System.out.println("Incorrect number, out of range.");
        }

        if (!weekDayName.isEmpty())
            System.out.format("This is %s\n", weekDayName);

    }

}
