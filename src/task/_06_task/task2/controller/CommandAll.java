package task._06_task.task2.controller;

import task._06_task.task2.controller.command.Command;

public interface CommandAll {
    Command execute(String request);
}
