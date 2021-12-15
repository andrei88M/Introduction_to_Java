package task._06_task.task1.controller;


import java.io.IOException;

public class Controller {
    public String contr(String request) throws IOException, ClassNotFoundException {
        String[] strings = request.split("\\W");
        CommandAll commandAll = new CommandAllImpl();
        String response;
        Command command = commandAll.execute(strings[0]);

        response = command.execute(request);
        return response;
    }
}
