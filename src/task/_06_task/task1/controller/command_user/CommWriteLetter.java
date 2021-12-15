package task._06_task.task1.controller.command_user;

import task._06_task.task1.controller.Commands;
import task._06_task.task1.controller.command_admin.CommAdm;
import task._06_task.task1.view.MailView;

import java.io.IOException;

public class CommWriteLetter implements CommUser, CommAdm {
    @Override
    public String execute(String request) throws IOException {
        MailView mailView = new MailView();
        boolean bool;
        bool = mailView.writeLetter();
        return bool ? Commands.USER.name() : Commands.WRITE_LETTER.name();
    }
}
