package task._06_task.task1.controller.command_admin;

import task._06_task.task1.controller.Command;
import task._06_task.task1.controller.CommandAll;

import java.io.IOException;

public interface CommAdm extends Command {
    String execute(String request) throws IOException, ClassNotFoundException;
}
