package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class StartUI {


    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);

        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (UserAction action : actions) {
            System.out.println(action.name());
        }
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>(7);
        actions.add(new CreateAction());
        actions.add(new ReplaceItem());
        actions.add(new DeleteItem());
        actions.add(new AllItemes());
        actions.add(new FindbyId());
        actions.add(new FindbyName());
        actions.add(new Exit());
        new StartUI().init(validate, tracker, actions);
    }
}

