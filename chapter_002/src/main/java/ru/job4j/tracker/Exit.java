package ru.job4j.tracker;

public class Exit implements UserAction {
    @Override
    public String name() {
        return "=== Exit tracker ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Exit.");
        return false;
    }
}

