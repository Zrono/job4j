package ru.job4j.oop;

public class Animal {
    public String name;
    public Animal() {
        System.out.println("Animal");
    }

    public Animal(String name) {
        super();
        this.name = name;
        System.out.println(getClass().getName());
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Philip");
        Animal animal1 = new Animal();
        Predator predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
