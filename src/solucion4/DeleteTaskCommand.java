package solucion4;

public class DeleteTaskCommand implements Command {
    private Task task;
    private TaskManager taskManager;

    public DeleteTaskCommand(Task task, TaskManager taskManager) {
        this.task = task;
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        taskManager.removeTask(task);
    }

    @Override
    public void undo() {
        taskManager.addTask(task);
    }
}

