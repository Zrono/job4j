package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(this.generateID());
        items.add(item);
        return item;
    }

    private String generateID() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public ArrayList<Item> findAll() {
        return new ArrayList<>(items);
    }


    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        int point = 0;
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    public Item findById(String id) {
        int i = indexOf(id);
        if (i == -1) {
            return null;
        } else {
            return items.get(i);
        }
    }


    private int indexOf(String id) {
        int index = -1;
        for (Item item : items) {
            index++;
            if (item.getId().equals(id)) {
                return index;
            }
        }
        return -1;
    }

    public boolean replace(String id, Item item) {
        int i = indexOf(id);
        if (i != -1) {
            item.setId(id);
            items.set(i, item);
            return true;
        }
        return false;
    }

    public boolean delete(String id) {
        int i = indexOf(id);
        if (i != -1) {
            items.remove(i);
            return true;
        }
        return false;
    }
}

