package task._06_task.task1.controller.command_scanner;

import task._06_task.task1.view.RequestView;

import java.io.IOException;

public class CommRegAuth implements CommScann {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        RequestView requestView = new RequestView();
        String response;
        response = requestView.regOrAuth();
        return response;
    }
}
