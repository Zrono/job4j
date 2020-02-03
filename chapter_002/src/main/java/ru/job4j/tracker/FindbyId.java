package ru.job4j.tracker;

public class FindbyId implements UserAction {
    @Override
    public String name() {
        return "=== Find by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("null");
        } else {
            System.out.println(item.getName());
        }
        return true;
    }
}
