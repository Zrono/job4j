package ru.job4j.io;

import java.util.Scanner;


public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int player = 0;
        while (matches >= 0) {
            System.out.println("Игрок возьмите от 1 до 3 спичек.");
            int select = Integer.valueOf(input.nextLine());
            matches -= select;
            player++;

            if (matches <= 0) {
                if (player % 2 == 0) {
                    System.out.println("Выиграл игрок 2");
                } else {
                    System.out.println("Выиграл игрок 1");
                }
            }
            System.out.println("Осталось " + matches + " спичек");

        }

    }

}
