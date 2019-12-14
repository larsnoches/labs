package com.company;

import java.util.Scanner;

public class Lab03_18_02
{

    public static void main(String[] args)
    {
        System.out.println("Enter a week day name (rus\\eng):");

        Scanner inCmd = new Scanner(System.in);
        String weekDayName = inCmd.next();

        weekDayName = weekDayName.toLowerCase();

        int weekDayNumber = 0;
        boolean weekDayNameInEnglish = true;

        if (weekDayName.length() > 2) {

            switch (weekDayName) {
                case "monday":
                    weekDayNumber = 1;
                    break;
                case "tuesday":
                    weekDayNumber = 2;
                    break;
                case "wednesday":
                    weekDayNumber = 3;
                    break;
                case "thursday":
                    weekDayNumber = 4;
                    break;
                case "friday":
                    weekDayNumber = 5;
                    break;
                case "saturday":
                    weekDayNumber = 6;
                    break;
                case "sunday":
                    weekDayNumber = 7;
                    break;
                default:
                    weekDayNameInEnglish = false;
            }

            if (!weekDayNameInEnglish) {
                switch (weekDayName) {
                    case "понедельник":
                        weekDayNumber = 1;
                        break;
                    case "вторник":
                        weekDayNumber = 2;
                        break;
                    case "среда":
                        weekDayNumber = 3;
                        break;
                    case "четверг":
                        weekDayNumber = 4;
                        break;
                    case "пятница":
                        weekDayNumber = 5;
                        break;
                    case "суббота":
                        weekDayNumber = 6;
                        break;
                    case "воскресенье":
                        weekDayNumber = 7;
                        break;
                    default:
                        weekDayNumber = 0;
                }
            }

            if (!weekDayNameInEnglish) {
                if (weekDayNumber > 0)
                    System.out.format("Номер введенного дня недели: %d\n", weekDayNumber);
                else
                    System.out.println("Введенный день недели не существует.");
            }
            else {
                System.out.format("The number day of week is %d\n", weekDayNumber);
            }

        }
        else {
            System.out.println("Incorrect length of week day name.");
        }

    }
}
