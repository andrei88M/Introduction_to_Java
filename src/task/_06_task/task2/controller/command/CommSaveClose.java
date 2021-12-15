package task._06_task.task2.controller.command;

import task._06_task.task2.bean.Notepad;
import task._06_task.task2.servise.NotesSave;

import java.io.IOException;

public class CommSaveClose implements Command {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        NotesSave notesSave = new NotesSave();
        Notepad notepad = new Notepad();
        String[] strings = request.split("\\W");
        String nameFile = strings[1];
        notesSave.save(notepad.getNoteList(), nameFile);
        return "EXIT";
    }
}
