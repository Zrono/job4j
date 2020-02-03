package ru.job4j.tracker;

public class AllItemes implements UserAction {
    @Override
    public String name() {
        return "=== All items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item.getId() + " " + item.getName());
        }
        return true;
    }
}
