package com.company;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Lab11_01_06 {

    public static void main(String[] args) {
        try {
            File folder = new File("E:\\My");
            if (!folder.exists())
                folder.mkdir();
//            Создание папки «My» на диске,
//            если она не существует
            File f1 = new File("E:\\My\\num1Mart.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
//            Создание файла в папке
            System.out.print("Сколько чисел надо записать в файл? \n => ");
            int count = sc.nextInt(); // ввести количество чисел

            // Открыть файл одновременно для чтения и записи "rw"
            RandomAccessFile rf = new RandomAccessFile(f1, "rw");
            System.out.println("Исходный размер файла в байтах =" + rf.length()
                    + ", указатель стоит на " + rf.getFilePointer() + "-м байте");
            System.out.println("Введите числа (double):");
            for (int i = 0; i < count; i++) {
                rf.writeDouble(sc.nextDouble()); // Записать числа в файл. На каждое
            } // число типа double приходится 8 байт
            System.out.println("Новый размер файла в байтах =" + rf.length()
                    + ", указатель стоит на " + rf.getFilePointer() + "-м байте");
            System.out.println("Количество байт на 1 число = " + rf.length() / count);
            rf.close();

            // Открыть файл только для чтения "r"
            rf = new RandomAccessFile(f1, "r");

            // Прочитать числа из файла и вывести на экран
            System.out.println("\n Числа в файле:");
            for (int i = 0; i < count; i++) { // i – текущий номер числа
                rf.seek(i * 8);
                // перевод указателя на текущее число i* 8 байта
                // в данной ситуации при последовательном считывании
                // операцию seek() можно было не использовать
                System.out.println("Число" + i + ": " + rf.readDouble());
            }
            System.out.println("Числа в обратном порядке:");
            for (int i = count - 1; i >= 0; i--) {
                rf.seek(i * 8); // операцию использовать обязательно!
                System.out.println("Число" + i + ": " + rf.readDouble());
            }
            rf.seek(rf.getFilePointer() - 8); // перевод указателя на последнее число
            System.out.println(" Количество чисел в файле= " + rf.length() / 8
                    + ", последнее число= " + rf.readDouble());

            // Поиск заданного числа в файле и определение его номера (номеров)
            System.out.print("\nВведите число, которое нужно найти в файле => ");
            double x = sc.nextDouble();
            int kol = 0; // количество искомых чисел в файле
            for (int i = 0; i < count; i++) {
                rf.seek(i * 8);
                double number = rf.readDouble();
                if (number == x) {
                    kol++;
                    System.out.print("номер " + i + ", ");
                }
            }

            System.out.println(" количество искомых чисел = " + kol);
            rf.close();

            // СОРТИРОВКА ЧИСЕЛ В ФАЙЛЕ МЕТОДОМ «ПУЗЫРЬКА»
            rf = new RandomAccessFile(f1, "rw"); // открыт для чтения и записи
            for (int k = 0; k < count; k++) { // k – номер просмотра
                for (int i = 0; i < count - k - 1; i++) { // i – номер числа
                    rf.seek(i * 8); // переход к i-тому числу
                    double number1 = rf.readDouble();
                    double number2 = rf.readDouble();
//                    чтение i -того и
//                            (i + 1) - го чисел в переменные
                    if (number1 > number2) { // условие для сортировки по возрастанию
                        rf.seek(i * 8);
                        rf.writeDouble(number2);
                        rf.writeDouble(number1);
                        //        возврат указателя на i-тое число и
                        //        перестановка (запись чисел в обратном
                        //                порядке)
                    }
                }
            }

            System.out.println("\n Числа, отсортированные в файле:");
            for (int i = 0; i < count; i++) {
                rf.seek(i * 8);
                System.out.print(" " + rf.readDouble());
            }
            rf.close();
        } catch (IOException e) {
            System.out.println("End of file " + e);
        }

    }
}

