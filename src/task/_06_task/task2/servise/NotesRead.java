package task._06_task.task2.servise;

import task._06_task.task2.bean.Note;
import task._06_task.task2.dao.DAONoteList;
import task._06_task.task2.dao.NoteListDAO;

import java.io.IOException;
import java.util.List;

public class NotesRead {
    public List<Note> get(String nameFile) throws IOException, ClassNotFoundException {
        List<Note> noteList;
        DAONoteList daoNoteList = new NoteListDAO();
        noteList = daoNoteList.read(nameFile);
        return noteList;
    }
}
