package task._06_task.task2.logic;

import task._06_task.task2.bean.Note;
import task._06_task.task2.bean.Notepad;

public class NoteOpen {
    public String open(String theme) {
        Notepad notepad = new Notepad();
        Note note = notepad.getNote(theme);
        String response = note.getName() + " " + note.getDateCreation() + " " + note.getEmail() + "\n" + note.getText();
        return response;
    }




}
