package task._06_task.task1.controller.command_scanner;

import task._06_task.task1.controller.Commands;
import task._06_task.task1.view.RequestView;

import java.io.IOException;

public class CommLogPassMail implements CommScann {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        RequestView requestView = new RequestView();
        String login = requestView.log();
        String password = requestView.pass();
        String mail = requestView.mail();
        String response = Commands.LOGIN_PASSWORD_MAIL.name() + "=" + login + "/" + password + "/" + mail;
        return response;
    }
}
