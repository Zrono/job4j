package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        tracker.delete(id);
        if (tracker.delete(id)) {
            System.out.println("Позиция удалена");
        } else {
            System.out.println("Позиция не найдена");
        }
        return true;
    }
}
