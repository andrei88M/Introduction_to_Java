package task._06_task.task2.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Note implements Serializable {
    private String name;
    private LocalDateTime dateCreation;
    private String email;
    private String text;

    public String getName() {
        return name;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }

    public Note(String name, String email, String text) {
        this.name = name;
        this.email = email;
        this.text = text;
        dateCreation = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Note{" +
                "name=" + name +
                ", dateCreation=" + dateCreation +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
