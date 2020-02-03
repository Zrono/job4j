package ru.job4j.oop;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("frist book", 100);
        Book book2 = new Book("second book", 200);
        Book book3 = new Book("third book", 300);
        Book book4 = new Book("clean code", 400);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        System.out.println("Просто вывод");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages());
        }
        System.out.println("Вывод с перестановкой");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages());
        }
        System.out.println("Вывод с условием");

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("clean code")) {
                System.out.println(books[i].getName() + " " + books[i].getPages());
            }
        }


    }
}
