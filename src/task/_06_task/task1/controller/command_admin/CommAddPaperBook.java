package task._06_task.task1.controller.command_admin;

import task._06_task.task1.controller.Commands;
import task._06_task.task1.logic.ManagerLibrary;

import java.io.IOException;

public class CommAddPaperBook implements CommAdm {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        ManagerLibrary managerLibrary = new ManagerLibrary();
        managerLibrary.addPaperBook(request, request, request);
        return Commands.ADMIN.name();
    }
}
