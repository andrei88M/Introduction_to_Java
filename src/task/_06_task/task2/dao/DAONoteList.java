package task._06_task.task2.dao;

import task._06_task.task2.bean.Note;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DAONoteList {
    void save(List<Note> noteList, String nameFile) throws IOException;

    List<Note> read(String nameFile) throws IOException, ClassNotFoundException;
}
