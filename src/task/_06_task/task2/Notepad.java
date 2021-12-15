package task._06_task.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notepad implements Serializable {

    private List<Note> notes;
    private File file;

    public Notepad(String nameFile) {
        file = new File("src" + File.separator + "task" + File.separator +
                           "_06_task" + File.separator + "task2" + nameFile + ".txt");
        if (file.exists()) {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                notes = (List<Note>) inputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            notes = new ArrayList<>();
        }
    }

    public void createNote(String theme, String email, String text) {
        Note note = new Note(theme, email, text);
        notes.add(note);
    }

    public List<Note> searchLocalDate(String localDate) {
        List<Note> list = new ArrayList<>();
        for (Note note : notes) {
            String str = "";
            Pattern pattern = Pattern.compile("(\\d|-){10}");
            Matcher matcher = pattern.matcher(note.getDateCreation().toString());
            if (matcher.find()) {
                str = matcher.group();
            }

            boolean bool = localDate.matches(str);
            if (bool) {
                list.add(note);
            }
        }
        return list;
    }

    public List<Note> searchTheme(String theme) {
        List<Note> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(theme);
        Matcher matcher;
        for (Note note : notes) {
            matcher = pattern.matcher(note.getTheme());
            if (matcher.find()) {
                list.add(note);
            }
        }
        return list;
    }

    public List<Note> searchMail(String mail) {
        List<Note> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(mail);
        Matcher matcher;
        for (Note note : notes) {
            matcher = pattern.matcher(note.getEmail());
            if (matcher.find()) {
                list.add(note);
            }
        }
        return list;
    }
}
