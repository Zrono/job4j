package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


public class StartUITest {
    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        List<UserAction> list = new ArrayList<>();
        list.add(action);
        new StartUI().init(input, new Tracker(), list);
        assertThat(action.isCall(), is(true));
    }
}