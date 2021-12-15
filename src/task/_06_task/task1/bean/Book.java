package task._06_task.task1.bean;

import java.io.File;
import java.io.Serializable;

public class Book implements Serializable {
    private String nameBook;
    private String author;
    private File eBook;
    private String pBook;

    public Book(String nameBook, String author) {
        this.nameBook = nameBook;
        this.author = author;
    }

    public File geteBook() {
        return eBook;
    }

    public void seteBook(File eBook) {
        this.eBook = eBook;
    }

    public String getpBook() {
        return pBook;
    }

    public void setpBook(String pBook) {
        this.pBook = pBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String eBookStr;
        if (eBook == null) {
            eBookStr = "null";
        } else {
            eBookStr = eBook.getName();
        }
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", eBook=" + eBookStr +
                ", pBook='" + pBook + '\'' +
                '}';
    }
}
