package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

public class FindbyName implements UserAction {
    @Override
    public String name() {
        return "=== Find by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println(item.getId() + " " + item.getName());
        }
        return true;
    }
}
