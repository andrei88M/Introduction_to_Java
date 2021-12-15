package task._06_task.task2.dao;

import task._06_task.task2.bean.Note;

import java.io.*;
import java.util.List;

public class NoteListDAO implements DAONoteList {
    @Override
    public void save(List<Note> noteList, String nameFile) throws IOException {
        File file = new File("src" + File.separator + "task" + File.separator +
                "_06_task" + File.separator + "task2" + File.separator + nameFile + ".txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(noteList);
        }
    }

    @Override
    public List<Note> read(String nameFile) throws IOException, ClassNotFoundException {
        List<Note> list = null;
        File file = new File("src" + File.separator + "task" + File.separator +
                "_06_task" + File.separator + "task2" + File.separator + nameFile + ".txt");
        if (!file.exists()) {
            return null;
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            list = (List<Note>) objectInputStream.readObject();
        }
        return list;
    }
}
