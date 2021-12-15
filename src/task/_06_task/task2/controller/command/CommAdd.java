package task._06_task.task2.controller.command;

import task._06_task.task2.bean.Note;
import task._06_task.task2.bean.Notepad;

import java.io.IOException;

public class CommAdd implements Command{
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        String[] strings = request.split("\\W");
        Notepad notepad = new Notepad();
        String name = strings[1];
        String mail = strings[2];
        String text = strings[3];
        Note note = new Note(name,mail,text);
        notepad.add(note);
        return "запись добавлена";
    }
}
