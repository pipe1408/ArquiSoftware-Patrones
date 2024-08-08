package solucion4;

import java.util.Stack;

public class CommandExecutor {
    private Stack<Command> commandHistory = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
