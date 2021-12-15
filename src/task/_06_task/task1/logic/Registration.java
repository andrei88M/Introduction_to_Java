package task._06_task.task1.logic;

import task._06_task.task1.bean.User;
import task._06_task.task1.dao.DAOMail;
import task._06_task.task1.dao.DAOUser;
import task._06_task.task1.dao.MailDAO;
import task._06_task.task1.dao.UserDAO;

import java.io.IOException;

public class Registration {
    public boolean createUser(String login, String password, String mail) throws IOException {
        User user = new User(login, password, mail);
        DAOUser daoUser = new UserDAO();
        boolean bool = false;
        bool = daoUser.save(user);
        if (bool) {
            DAOMail daoMail = new MailDAO();
            daoMail.save(mail, "create mail");
        }
        return bool;
    }

    public boolean createUser(User user) throws IOException {
        DAOUser daoUser = new UserDAO();
        boolean bool;
        bool = daoUser.save(user);
        if (bool) {
            DAOMail daoMail = new MailDAO();
            daoMail.save(user.getEmail(), "create mail");
        }
        return bool;
    }
}
