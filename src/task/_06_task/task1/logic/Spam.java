package task._06_task.task1.logic;

import task._06_task.task1.dao.DAOeBook;
import task._06_task.task1.dao.EBookDAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Spam {
    public void writeLetterAll(String textLetter, String nameBook, String author) throws IOException {
        File file = new File("src" + File.separator + "task" + File.separator + "_06_task" +
                File.separator + "task1" + File.separator + "file" + File.separator + "mail");
        File[] files = file.listFiles();
        if (files != null) {
            for (File indexFile : files) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(indexFile, true))) {
                    bufferedWriter.write(textLetter + nameBook + author + "\n");
                }
            }
        }
    }

    public void writeLetterBook(String textLetter, String mail, String name, String author) throws IOException {
        File file = new File("src" + File.separator + "task" + File.separator + "_06_task" +
                File.separator + "task1" + File.separator + "file" + File.separator + "mail" + File.separator + mail + ".txt");
        if (file.exists()) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
                bufferedWriter.write(textLetter + " " + name + author + "\n");
            }
            DAOeBook daOeBook = new EBookDAO();
            File book = new File("src" + File.separator + "task" + File.separator + "_06_task" +
                    File.separator + "task1" + File.separator + "file" + File.separator + "book" +
                    File.separator + "e_book" + File.separator + name + author + ".txt");
            boolean bool;
           book.createNewFile();

        }

    }
}
