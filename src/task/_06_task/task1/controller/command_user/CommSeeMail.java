package task._06_task.task1.controller.command_user;

import task._06_task.task1.controller.Commands;
import task._06_task.task1.controller.command_admin.CommAdm;
import task._06_task.task1.view.MailView;

import java.io.IOException;

public class CommSeeMail implements CommUser, CommAdm {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        MailView mailView = new MailView();
        String response = mailView.seeMail(request);
        System.out.println(response);
        return Commands.USER.name();
    }
}
