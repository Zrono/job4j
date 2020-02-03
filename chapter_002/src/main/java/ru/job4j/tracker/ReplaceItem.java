package ru.job4j.tracker;

public class ReplaceItem implements UserAction {
    @Override
    public String name() {
        return "=== Replaced item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter a new name: ");
        Item item = new Item(name);
        tracker.replace(id, item);
        if (tracker.replace(id, item)) {
            System.out.println("Позиция с id " + id + " имеет новое имя " + name);
        } else {
            System.out.println("Позиция не найдена");
        }
        return true;
    }
}
