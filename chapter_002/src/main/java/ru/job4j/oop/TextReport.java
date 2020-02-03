package ru.job4j.oop;

public class TextReport {
    public String generate(String name, String body) {
        //@Override тут он же не нужен? так как класс TextReport яфвляется базовым. Или я чтото упустил?

        return name + System.lineSeparator() + body;
    }
}
