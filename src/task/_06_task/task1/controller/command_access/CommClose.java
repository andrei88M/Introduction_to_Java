package task._06_task.task1.controller.command_access;

import task._06_task.task1.controller.command_admin.CommAdm;
import task._06_task.task1.controller.command_user.CommUser;

import java.io.IOException;

public class CommClose implements CommAccess, CommUser, CommAdm {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        System.exit(0);
        return null;
    }
}
