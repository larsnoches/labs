package com.company;

import java.io.*;
import java.util.Scanner;

class Movie implements Serializable {
    String name;
    String genre;
    String country;
    int year;
    int price;
}

public class Lab11_03_02 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // создается файл на диске
        File f = new File("movies");
        f.createNewFile();

        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.print("Введите количество фильмов для записи в файл\n"
                + "=> ");

        int movieCount = sc.nextInt();
        sc.nextLine(); // очистка буфера после ввода числа

        // -------------ЗАПИСЬ ОБЪЕКТА В ФАЙЛ-------------
        // Создается поток для записи объекта
        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            for (int i = 0; i < movieCount; i++) {
                Movie movie = new Movie();
                System.out.print("Введите название " + (i + 1) + " фильма => ");
                movie.name = sc.next();

                System.out.print("Введите его жанр => ");
                movie.genre = sc.next();

                System.out.print("Введите страну его происхождения => ");
                movie.country = sc.next();

                System.out.print("Введите год его выпуска => ");
                movie.year = sc.nextInt();

                System.out.print("Введите стоимость проката => ");
                movie.price = sc.nextInt();
                sc.nextLine(); // очистка буфера

                // Объект записывается в файл
                oos.writeObject(movie);
            }

            // Дописывается информация и закрывается файловый поток
            oos.flush();
        } catch (IOException e) {
            System.out.format("Error: %s\n", e.getMessage());
        }

        // -------------ЧТЕНИЕ ОБЪЕКТА ИЗ ФАЙЛА-------------
        // Создается поток для чтения объекта из файла

        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream oin = new ObjectInputStream(fis)) {

            File f2 = new File("movies_rus");
            f2.createNewFile();

            try (FileOutputStream fos = new FileOutputStream(f2);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (int i = 0; i < movieCount; i++) {
                    Movie movie = (Movie) oin.readObject();
                    String country1251 = new String(movie.country.getBytes("cp1251"));
                    if (country1251.toUpperCase().equals("РОССИЯ")) {
                        oos.writeObject(movie);
                        System.out.format(
                                "Сохранен фильм %s от %d года выпуска",
                                new String(movie.name.getBytes("cp1251")),
                                movie.year
                        );
                    }
                }
                oos.flush();
            } catch (IOException e) {
                System.out.format("Error: %s\n", e.getMessage());
            }

        } catch (IOException e) {
            System.out.format("Error: %s\n", e.getMessage());
        }
    }
}
