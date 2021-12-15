package task._06_task.task1.dao;

import task._06_task.task1.bean.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DAOBook {
    String separator = File.separator;

    boolean save(Book book) throws IOException;
    Book get(String name,String author) throws IOException, ClassNotFoundException;
    List<Book> getAll() throws IOException, ClassNotFoundException;
    boolean update(Book book) throws IOException;
    boolean remove(Book book);
}
