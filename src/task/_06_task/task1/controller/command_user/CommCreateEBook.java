package task._06_task.task1.controller.command_user;

import task._06_task.task1.controller.Commands;
import task._06_task.task1.controller.command_admin.CommAdm;
import task._06_task.task1.dao.DAOeBook;
import task._06_task.task1.dao.EBookDAO;

import java.io.File;
import java.io.IOException;

public class CommCreateEBook implements CommUser, CommAdm {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        DAOeBook daOeBook = new EBookDAO();
        File file = new File(request);
        boolean bool;
        bool = daOeBook.save(file);
        if (bool) {
            System.out.println("книга создана");
        } else {
            System.out.println("книга уже существует");
        }
        return Commands.WRITE_LETTER.name();
    }
}
