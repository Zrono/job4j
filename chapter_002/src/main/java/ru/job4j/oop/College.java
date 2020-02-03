package ru.job4j.oop;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup(412);
        student.setReceiptDate(new Date());
        System.out.println("New student " + student.getFullName() + "has go to college in " + student.getGroup() + " group " + student.getReceiptDate());

    }
}
