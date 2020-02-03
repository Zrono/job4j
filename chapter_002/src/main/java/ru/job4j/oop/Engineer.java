package ru.job4j.oop;

public class Engineer extends Profession {
    private int salary;

    public Engineer(String name, String surname, String education, String birthday, int salary) {
        super(name, surname, education, birthday);
        this.salary = salary;

    }

    public int getSalary() {
        return salary;
    }
}
