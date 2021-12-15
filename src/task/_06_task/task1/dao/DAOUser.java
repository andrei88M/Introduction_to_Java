package task._06_task.task1.dao;

import task._06_task.task1.bean.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface DAOUser {
    String separator = File.separator;

    boolean save(User user) throws IOException;
    User get(String login) throws IOException, ClassNotFoundException;
    boolean update(User user) throws IOException;
    boolean remove(User user);
}
