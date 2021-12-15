package task._06_task.task2.bean;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private static Notepad notepad;
    private List<Note> noteList;

    {
        noteList = new ArrayList<>();
    }


    public void add(Note note) {
        noteList.add(note);
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public Note getNote(String theme) {
        for (Note note : noteList) {
            if (note.getName().equalsIgnoreCase(theme)) {
                return note;
            }
        }
        return null;
    }
}
