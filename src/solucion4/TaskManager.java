package solucion4;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task.getName());
    }

    public void removeTask(Task task) {
        tasks.remove(task);
        System.out.println("Task removed: " + task.getName());
    }
}

