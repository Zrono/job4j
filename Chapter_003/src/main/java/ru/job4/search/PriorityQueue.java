package ru.job4.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();


    public void put(Task task) {
        int index = 0;
        for (Task t : tasks) {
            if (task.getPriority() <= t.getPriority()) {
                break;
            } else {
                index++;
            }
        }
        tasks.add(index, task);
    }


    public Task take() {
        return this.tasks.poll();
    }
}



