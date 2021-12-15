package task._06_task.task1.view;

import task._06_task.task1.bean.Book;
import task._06_task.task1.controller.Commands;
import task._06_task.task1.dao.BookDAO;
import task._06_task.task1.dao.DAOBook;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BookView {
    public void seeInfo(Book book) {
        System.out.println(book);
    }

    public String seeLibrary() throws IOException, ClassNotFoundException {
        DAOBook daoBook = new BookDAO();
        List<Book> books = daoBook.getAll();
        for (Book book : books) {
            System.out.println(book);
        }
        return Commands.USER.name();
    }
}
