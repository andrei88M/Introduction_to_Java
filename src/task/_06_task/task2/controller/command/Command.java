package task._06_task.task2.controller.command;

import java.io.IOException;

public interface Command {
    String execute(String request) throws IOException, ClassNotFoundException;
}
