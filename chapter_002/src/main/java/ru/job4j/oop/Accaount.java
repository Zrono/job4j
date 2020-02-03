package ru.job4j.oop;

public class Accaount {
    private int balance;

    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }
}
