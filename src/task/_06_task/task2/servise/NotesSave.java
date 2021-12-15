package task._06_task.task2.servise;

import task._06_task.task2.bean.Note;
import task._06_task.task2.dao.DAONoteList;
import task._06_task.task2.dao.NoteListDAO;

import java.io.IOException;
import java.util.List;

public class NotesSave {
    public void save(List<Note> list,String nameFile) throws IOException {
        DAONoteList daoNoteList = new NoteListDAO();
        daoNoteList.save(list,nameFile);
    }
}
