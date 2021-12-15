package task._06_task.task1.dao;

import task._06_task.task1.bean.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO implements DAOBook {
    private final File fileBook = new File("src" + separator + "task" + separator + "_06_task" +
            separator + "task1" + separator + "file" + separator + "book" + separator + "newFile.txt");

    @Override
    public boolean save(Book book) throws IOException {
        File file = new File(fileBook.getParent() + separator + book.getNameBook() + book.getAuthor() + ".txt");
        if (fileBook.exists()) {
            return false;
        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(book);
        }
        return true;
    }

    @Override
    public Book get(String name, String author) throws IOException, ClassNotFoundException {
        Book book = null;
        File file = new File(fileBook.getParent() + separator + name + author + ".txt");
        if (!file.exists()) {
            return null;
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            book = (Book) inputStream.readObject();
        }
        return book;
    }

    @Override
    public List<Book> getAll() throws IOException, ClassNotFoundException {
        List<Book> books = new ArrayList<>();
        Book book;
        File f = new File(fileBook.getParent());
        File[] files = f.listFiles();
        System.out.println(files.length);
        if (files != null) {
            for (File file : files) {
                if (!file.isFile()){continue;}
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                    book = (Book) inputStream.readObject();
                    books.add(book);
                }
            }
        }
        return books;
    }

    @Override
    public boolean update(Book book) throws IOException {
        File file = new File(fileBook.getParent() + separator + book.getNameBook() + book.getAuthor() + ".txt");
        if (!file.exists()) {
            return false;
        }
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(book);
        }
        return true;
    }

    @Override
    public boolean remove(Book book) {
        File file = new File(fileBook.getParent() + separator + book.getNameBook() + book.getAuthor() + ".txt");
        return file.delete();
    }
}
