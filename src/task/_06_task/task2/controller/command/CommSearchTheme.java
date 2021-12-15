package task._06_task.task2.controller.command;

import task._06_task.task2.logic.Search;

import java.io.IOException;

public class CommSearchTheme implements Command {
    @Override
    public String execute(String request) throws IOException, ClassNotFoundException {
        String[] strings = request.split("\\W");
        String theme = strings[1];
        Search search = new Search();
        String response = search.searchTheme(theme);
        return response;
    }
}
