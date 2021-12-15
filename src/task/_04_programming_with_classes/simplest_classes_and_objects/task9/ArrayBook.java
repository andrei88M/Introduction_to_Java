package task._04_programming_with_classes.simplest_classes_and_objects.task9;

public class ArrayBook {
    private int index = 0;
    private Book[] books;

    public ArrayBook(int size) {
        books = new Book[size];
    }

    public void add(Book book) {
        books[index] = book;
        index++;
    }

    public void searchByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
            }
        }
    }

    public void searchByPublishingHouse(String publishingHouse) {
        for (Book book : books) {
            if (book.getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
                System.out.println(book);
            }
        }
    }

    public void searchByYear(int moreThenYear) {
        for (Book book : books) {
            if (book.getYearOfPublication() > moreThenYear) {
                System.out.println(book);
            }
        }
    }

    public void printAll(){
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
