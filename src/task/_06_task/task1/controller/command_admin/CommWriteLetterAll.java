package task._06_task.task1.controller.command_admin;

import task._06_task.task1.controller.Commands;
import task._06_task.task1.logic.Spam;

import java.io.IOException;

public class CommWriteLetterAll implements CommAdm {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        Spam spam = new Spam();
        spam.writeLetterAll(request, request, request);
        return Commands.ADMIN.name();
    }
}
