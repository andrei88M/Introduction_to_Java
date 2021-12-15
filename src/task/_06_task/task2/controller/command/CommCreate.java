package task._06_task.task2.controller.command;

import task._06_task.task2.servise.CreateNotepad;

import java.io.IOException;

public class CommCreate implements Command{
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        CreateNotepad createNotepad = new CreateNotepad();
        String str = createNotepad.create();
        return str;
    }
}
