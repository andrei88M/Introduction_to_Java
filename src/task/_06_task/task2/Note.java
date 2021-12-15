package task._06_task.task2;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Note implements Serializable {
    private String theme;
    private LocalDateTime dateCreation;
    private String email;
    private String text;

    public Note(String theme, String email, String text) {
        this.theme = theme;
        this.email = email;
        this.text = text;
    }

    public String getTheme() {
        return theme;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Note{" +
                "theme='" + theme + '\'' +
                ", dateCreation=" + dateCreation +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
