package task._06_task.task1.controller.command_user;

import task._06_task.task1.controller.command_admin.CommAdm;
import task._06_task.task1.view.BookView;

import java.io.IOException;

public class CommSeeCatalog implements CommUser, CommAdm {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        BookView bookView = new BookView();
        String response = bookView.seeLibrary();
        return response;
    }
}
