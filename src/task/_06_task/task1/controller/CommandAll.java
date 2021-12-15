package task._06_task.task1.controller;

import java.io.IOException;

public interface CommandAll {
    Command execute(String request) throws IOException, ClassNotFoundException;
}
