package task._06_task.task1.logic;

import task._06_task.task1.bean.Book;
import task._06_task.task1.dao.BookDAO;
import task._06_task.task1.dao.DAOBook;

import java.io.*;

public class FinderBook {
    public Book search(String name, String author) throws IOException, ClassNotFoundException {
        File file = new File("src" + File.separator + "task" + File.separator + "_06_task" +
                File.separator + "task1" + File.separator + "book" + File.separator + "library_book");
        File[] files = file.listFiles();

        if (files != null) {

            String str = name + author + ".txt";
            for (File f : files) {
                if (str.equals(f.getName())) {
                    DAOBook daoBook = new BookDAO();
                    Book book = daoBook.get(name, author);
                    return book;
                }
            }
        }
        return null;
    }
}
