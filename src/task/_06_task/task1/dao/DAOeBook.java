package task._06_task.task1.dao;

import java.io.File;
import java.io.IOException;

public interface DAOeBook {
    String separator = File.separator;
    boolean save(File eBook) throws IOException;
    File get(String nameFile);
    boolean update(File eBook) throws IOException;
    boolean remove(String nameFile);
}
