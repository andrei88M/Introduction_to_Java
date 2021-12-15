package task._06_task.task1.logic;

import task._06_task.task1.bean.User;
import task._06_task.task1.dao.DAOUser;
import task._06_task.task1.dao.UserDAO;

import java.io.IOException;

public class Authentication {
    public User authenticUser(String login, String password) throws IOException, ClassNotFoundException {
        DAOUser daoUser = new UserDAO();
        User user = daoUser.get(login);
        if (user == null || !user.getPassword().equals(password)) {
            return null;
        }
        return user;
    }
}
