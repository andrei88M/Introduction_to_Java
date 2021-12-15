package task._06_task.task3;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String surname;
    private String mail;
    private String text;

    public Student(String name, String surname, String mail, String text) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.text = text;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
