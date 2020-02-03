package ru.job4j.poly;

public class College {
    public static void main(String[] args) {
        // Создаем обьект класса Freshman
        Freshman freshman = new Freshman();
        // Приводим к типу родителя Student
        Student student = freshman;
        // Приводим к типу родителя Object
        Object object = freshman;



    }
}
