package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String a = "Неизвестное слово " + eng;
        return a;
    }

    public static void main(String[] args) {
        DummyDic week = new DummyDic();
        String book = week.engToRus("Book");
        System.out.println(book);


    }
}
