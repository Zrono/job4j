package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateID());
        this.items[this.position++] = item;
        return item;
    }

    private String generateID() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }


    public Item[] findByName(String key) {
        Item[] find = new Item[position];
        int point = 0;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getName().equals(key)) {
                find[point++] = this.items[i];
            }
        }
        return Arrays.copyOf(find, point);
    }

    public Item findById(String id) {
        int i = indexOf(id);
        if (i == -1) {
            return null;
        } else {
            return items[i];
        }
    }


    private int indexOf(String id) {
        int index = -1;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                index = i;
                break;
            }
        }

        return index;
    }

    public boolean replace(String id, Item item) {
        int i = indexOf(id);
        if (i != -1) {
            this.items[i] = item;
            item.setId(id);
            return true;
        }
        return false;
    }

    public boolean delete(String id) {
        int i = indexOf(id);
        if (i != -1) {
            this.items[i] = null;
            System.arraycopy(this.items, i + 1, this.items, i, this.position - i);
            position--;
            return true;
        }
        return false;
    }
}

