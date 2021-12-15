package task._06_task.task1.console;

import task._06_task.task1.controller.Commands;
import task._06_task.task1.controller.Controller;
import task._06_task.task1.view.RequestView;

import java.io.IOException;

//редактировать
public class Console {
    public void console() throws IOException, ClassNotFoundException {
        RequestView enter = new RequestView();
        Controller controller = new Controller();
        String request = Commands.REG_AUTH.name();
        String response;

        while (true) {
            response = controller.contr(request);
            request = response;
        }
    }
}
