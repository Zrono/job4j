package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void trip() {
        System.out.println("Travel bus");

    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Passemgers: " + passengers);

    }

    @Override
    public double gasStation(double fuel) {
        System.out.println("Fuel cost: " + 48.9);
        return fuel * 48.9;
    }
}
