package solucion4;

public class CreateTaskCommand implements Command {
    private Task task;
    private TaskManager taskManager;

    public CreateTaskCommand(Task task, TaskManager taskManager) {
        this.task = task;
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        taskManager.addTask(task);
    }

    @Override
    public void undo() {
        taskManager.removeTask(task);
    }
}

