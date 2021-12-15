package task._06_task.task2.controller.command;

import task._06_task.task2.logic.NoteOpen;

import java.io.IOException;

public class CommOpenNote implements Command{
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        String[] strings = request.split("\\W");
        String theme = strings[1];
        NoteOpen noteOpen = new NoteOpen();
        String response = noteOpen.open(theme);
        return response;
    }
}
