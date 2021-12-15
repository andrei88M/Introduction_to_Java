package task._06_task.task1.controller.command_access;

import task._06_task.task1.controller.Commands;
import task._06_task.task1.logic.Registration;

import java.io.IOException;

public class CommReg implements CommAccess {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        String[] strings = request.split("\\W");
        String login = strings[1];
        String password = strings[2];
        String mail = strings[3];
        Registration registration = new Registration();
        boolean bool;
        bool = registration.createUser(login, password, mail);
        return bool ? Commands.AUTHENTICATION.name() : Commands.REGISTRATION.name();
    }
}
