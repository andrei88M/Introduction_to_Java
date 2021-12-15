package task._06_task.task1.controller.command_access;

import task._06_task.task1.controller.Commands;
import task._06_task.task1.bean.User;
import task._06_task.task1.logic.Authentication;

import java.io.IOException;

public class CommAuth implements CommAccess {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        Authentication authentication = new Authentication();
        User user;

        String[] strings = request.split("\\W");
        String login = strings[1];
        String password = strings[2];
        user = authentication.authenticUser(login, password);
        if (user == null) {
            return Commands.AUTHENTICATION.name();
        } else if (user.isRoleUser()) {
            return Commands.USER.name();
        } else {
            return Commands.ADMIN.name();
        }
    }
}
