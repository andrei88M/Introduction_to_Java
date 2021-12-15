package task._06_task.task1.logic;

import task._06_task.task1.bean.Book;
import task._06_task.task1.bean.User;
import task._06_task.task1.dao.BookDAO;
import task._06_task.task1.dao.DAOBook;
import task._06_task.task1.dao.DAOeBook;
import task._06_task.task1.dao.EBookDAO;

import java.io.File;
import java.io.IOException;

public class ManagerLibrary {

    public boolean addPaperBook(String name, String author, String address) throws IOException, ClassNotFoundException {

        DAOBook daoBook = new BookDAO();
        Book book = daoBook.get(name, author);
        if (book == null) {
            book = new Book(name, author);
        }
        book.setpBook(address);

        boolean boll;
        boll = daoBook.update(book);

        if (!boll) {
            return daoBook.save(book);
        }
        return boll;
    }

    public void addVirtualBook(String name, String author) throws IOException, ClassNotFoundException {

        DAOBook daoBook = new BookDAO();
        Book book = daoBook.get(name, author);
        File file = new File("src" + File.separator + "task" + File.separator + "_06_task" +
                File.separator + "task1" + File.separator + "file" + File.separator + "book" +
                File.separator + "e_book" + File.separator + name + author + ".txt");

        if (book == null) {
            book = new Book(name, author);
            daoBook.save(book);
        }
        DAOeBook daOeBook = new EBookDAO();
        daOeBook.save(file);
        file = daOeBook.get(file.getName());

        book.seteBook(file);
        daoBook.update(book);
    }
}
