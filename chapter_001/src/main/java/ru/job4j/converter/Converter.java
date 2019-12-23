package ru.job4j.converter;
public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
        }

    public static int rubleToDollar (int value) {
        return value / 60;
    }
    public static int euroToRuble (int value) {
        return value * 70;
    }
    public static int dollarToRuble (int value) {
        return value * 60;
    }


public static void main (String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro (in);
        boolean passed = expected == out;
        int in2 = 180;
        int expected2 = 3;
        int out2 = rubleToDollar (in2);
        boolean passed2 = expected2 == out2;
        int in3 = 5;
        int expected3 = 350;
        int out3 = euroToRuble (in3);
        boolean passed3 = expected3 == out3;
        int in4 = 8;
        int expected4 = 480;
        int out4 = dollarToRuble (in4);
        boolean passed4 = expected4 == out4;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("180 rubles are 3. Test result : " + passed2);
        System.out.println("5 euro are 350. Test result : " + passed3);
        System.out.println("8 dollars are 480. Test result : " + passed4);

        }


        }