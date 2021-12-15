package task._06_task.task1.dao;

import task._06_task.task1.bean.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface DAOMail {
    String separator = File.separator;

    void save(String mail, String text) throws IOException;

    String get(String mail) throws IOException;

    boolean update(String mail, String text) throws IOException;

    boolean remove(String mail);
}
