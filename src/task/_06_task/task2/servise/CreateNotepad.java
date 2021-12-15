package task._06_task.task2.servise;

import task._06_task.task2.bean.Notepad;

import java.util.ArrayList;

public class CreateNotepad {
    public String create() {
        Notepad notepad = new Notepad();
        notepad.setNoteList(new ArrayList<>());
        return "создан новый блокнот";
    }
}
