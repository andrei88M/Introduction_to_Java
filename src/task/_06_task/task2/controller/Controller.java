package task._06_task.task2.controller;

import task._06_task.task2.controller.command.Command;

import java.io.IOException;

public class Controller {
    public String controller(String request) {
        CommandAll commandAll;
        Command command;
        String response = null;

        commandAll = new CommandAllImpl();
        command = commandAll.execute(request);


        try {
            response = command.execute(request);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return Commands.ERROR.name();
        }
        return response;
    }
}
