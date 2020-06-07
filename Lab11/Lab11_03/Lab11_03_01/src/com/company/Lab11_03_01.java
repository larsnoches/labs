package com.company;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class Lab11_03_01 {

    public static void main(String[] args) {
        try {
            File f1 = new File("movies.txt");
            if (!f1.exists())
                f1.createNewFile();

            RandomAccessFile rf = new RandomAccessFile(f1, "rw"); // чтение и запись
            long fSize = rf.length(); // размер файла

            Scanner sc = new Scanner(System.in, "cp1251");
            System.out.print("Введите количество фильмов для записи в файл\n"
                    + "=> ");

            int movieCount = sc.nextInt();
            sc.nextLine(); // очистка буфера после ввода числа

            String name, country, genre;
            int year, price;

//            ----ЗАПИСЬ ИНФОРМАЦИИ О ФИЛЬМАХ В ФАЙЛ----
            for (int i = 0; i < movieCount; i++) {
                System.out.print("Введите название " + (i + 1) + " фильма => ");
                name = sc.next();
                if (name.length() > 20)
                    name = name.substring(0, 19);
                rf.seek(rf.length()); // поиск конца файла
                rf.writeUTF(name); // запись названия
                for (int j = 0; j < 20 - name.length(); j++)
                    rf.writeByte(1); // добавление байтов до 20-ти любой цифрой (=1)

                System.out.print("Введите его жанр => ");
                genre = sc.next();
                if (genre.length() > 20)
                    genre = genre.substring(0, 19);
                rf.writeUTF(genre); // запись жанра
                for (int j = 0; j < 20 - genre.length(); j++)
                    rf.writeByte(1); // добавление байтов до кол=20 любым числом

                System.out.print("Введите страну его происхождения => ");
                country = sc.next();
                if (country.length() > 20)
                    country = country.substring(0, 19);
                rf.writeUTF(country); // запись страны
                for (int j = 0; j < 20 - country.length(); j++)
                    rf.writeByte(1); // добавление байтов до кол=20 любым числом

                System.out.print("Введите год его выпуска => ");
                year = sc.nextInt();
                sc.nextLine(); // очистка буфера
                rf.writeInt(year); // запись года

                System.out.print("Введите стоимость проката => ");
                price = sc.nextInt();
                sc.nextLine(); // очистка буфера
                rf.writeInt(price); // запись стоимости
            }
            rf.close();

            //----КОПИРОВАНИЕ ИНФОРМАЦИИ О ФИЛЬМАХ ИЗ ФАЙЛА----
            rf = new RandomAccessFile(f1, "r");
            rf.seek(0); // перемещение в начало файла

            File f2 = new File("movies_rus.txt");
            if (!f2.exists())
                f2.createNewFile();
            RandomAccessFile rfRus = new RandomAccessFile(f2, "rw"); // чтение и запись

            for (int i = 0; i < movieCount; i++) {
                name = rf.readUTF();
                for (int j = 0; j < 20 - name.length(); j++)
                    rf.readByte();

                genre = rf.readUTF();
                for (int j = 0; j < 20 - genre.length(); j++)
                    rf.readByte();

                country = rf.readUTF();
                for (int j = 0; j < 20 - country.length(); j++)
                    rf.readByte();

                year = rf.readInt();
                price = rf.readInt();

                String country1251 = new String(country.getBytes("cp1251"));

                if (country1251.toUpperCase().equals("РОССИЯ")) {
                    rfRus.seek(rfRus.length()); // поиск конца файла
                    rfRus.writeUTF(name); // запись названия
                    for (int j = 0; j < 20 - name.length(); j++)
                        rfRus.writeByte(1); // добавление байтов до 20-ти любой цифрой (=1)

                    rfRus.writeUTF(genre); // запись жанра
                    for (int j = 0; j < 20 - genre.length(); j++)
                        rfRus.writeByte(1); // добавление байтов до 20-ти любой цифрой (=1)

                    rfRus.writeUTF(country); // запись страны
                    for (int j = 0; j < 20 - country.length(); j++)
                        rfRus.writeByte(1); // добавление байтов до 20-ти любой цифрой (=1)

                    rfRus.writeInt(year); // запись года
                    rfRus.writeInt(price); // запись стоимости

                    System.out.format("Сохранен фильм %s от %d года выпуска", new String(name.getBytes("cp1251")), year);
                }
            }
            rf.close();
            rfRus.close();

        } catch (IOException e) {
            System.out.println("End of file " + e);
        }
    }
}
