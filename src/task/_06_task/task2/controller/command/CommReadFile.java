package task._06_task.task2.controller.command;

import task._06_task.task2.bean.Notepad;
import task._06_task.task2.servise.NotesRead;

import java.io.IOException;

public class CommReadFile implements Command {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        String[] strings = request.split("\\W");
        NotesRead notesRead = new NotesRead();
        String nameFile = strings[1];
        Notepad notepad = new Notepad();
        notepad.setNoteList(notesRead.get(nameFile));
        if (notepad.getNoteList() == null) {
            return "=файл не найден";
        }
        return "=блокнот открыт";
    }
}
