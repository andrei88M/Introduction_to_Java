package task._06_task.task2.controller;

import task._06_task.task2.controller.command.*;

import java.util.HashMap;
import java.util.Map;

public class CommandAllImpl implements CommandAll {
    private Map<String, Command> map;

    {
        map = new HashMap<>();
        map.put(Commands.OPEN.name(), new CommReadFile());
        map.put(Commands.CLOSE.name(), new CommSaveClose());
        map.put(Commands.ADD.name(), new CommAdd());
        map.put(Commands.SEARCH_THEME.name(), new CommSearchTheme());
        map.put(Commands.OPEN.name(), new CommOpenNote());
        map.put(Commands.CREATE.name(), new CommCreate());
    }

    @Override
    public Command execute(String request) {
        String comm = request.split("\\W")[0];
        return map.get(comm);
    }
}
