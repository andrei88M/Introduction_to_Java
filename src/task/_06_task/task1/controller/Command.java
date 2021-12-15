package task._06_task.task1.controller;

import java.io.IOException;

public interface Command {
    String execute(String request) throws IOException, ClassNotFoundException;
}
