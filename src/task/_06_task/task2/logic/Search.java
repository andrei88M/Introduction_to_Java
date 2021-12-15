package task._06_task.task2.logic;

import task._06_task.task2.bean.Note;
import task._06_task.task2.bean.Notepad;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {
    public String searchTheme(String theme) {
        Notepad notepad = new Notepad();
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile(theme);
        Matcher matcher;
        for (Note note : notepad.getNoteList()) {
            matcher = pattern.matcher(note.getName());
            if (matcher.find()) {
               stringBuilder.append(note.getName()).append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
