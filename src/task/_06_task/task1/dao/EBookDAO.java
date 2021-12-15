package task._06_task.task1.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EBookDAO implements DAOeBook {
    private String string = "src" + separator + "task" + separator + "_06_task" +
            separator + "task1" + separator + "file" + separator + "book" + separator + "e_book" + separator;

    @Override
    public boolean save(File eBook) throws IOException {
        if (!eBook.exists()) {
            return false;
        }
        String string2 = "src" + separator + "task" + separator + "_06_task" +
                separator + "task1" + separator + "file" + separator + "book" + separator + "library_book" + separator + eBook.getName();
        File file2 = new File(string2);
        if (!file2.exists()) {
            Files.move(Paths.get(string + eBook.getName()),
                    Paths.get(string2));
            return true;
        }
        return false;
    }

    @Override
    public File get(String nameFile) {
        File file = new File(string + nameFile);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Override
    public boolean update(File eBook) throws IOException {
        File file = new File(string + eBook.getName());
        if (!file.exists()) {
            return false;
        }
        String string2 = "src" + separator + "task" + separator + "_06_task" +
                separator + "task1" + separator + "file" + separator + "book" + separator + "library_book" + separator + eBook.getName();
        File file2 = new File(string2);
        if (!file2.exists()) {
            Files.move(Paths.get(string), Paths.get(string2));
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(String nameFile) {
        return false;
    }
}
