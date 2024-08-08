package solucion4;
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        CommandExecutor executor = new CommandExecutor();

        Task task1 = new Task("Task 1");
        Command createTaskCommand = new CreateTaskCommand(task1, taskManager);

        executor.executeCommand(createTaskCommand);

        executor.undoLastCommand();
    }
}
