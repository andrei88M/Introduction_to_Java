package tasks._04_programming_with_classes.simplest_classes_and_objects;

import tasks.Task;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task9.ArrayBook;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task9.Book;

public class Task9 implements Task {
    private static int id = 1;

    @Override
    public void solving() {
        System.out.println("Создать класс Book, спецификация которого приведена ниже. Определить конструкторы," +
                "set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book,\n" +
                "с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные.\n" +
                "\nBook: id, название, автор, издательство, год издания, количество страниц,цена,тип переплета.\n" +
                "Найти и вывести:\n" +
                "a)список книг заданного автора;\n" +
                "b)сптсок книг, выпущенных заданным издательством;\n" +
                "c)список книг, выпущенных после заданного года.");
        ArrayBook arrayBook = new ArrayBook(5);
        arrayBook.add(getRandomBook());
        arrayBook.add(getRandomBook());
        arrayBook.add(getRandomBook());
        arrayBook.add(getRandomBook());
        arrayBook.add(getRandomBook());

        arrayBook.printAll();
        System.out.println();

        arrayBook.searchByAuthor("author1");
        System.out.println();

        arrayBook.searchByPublishingHouse("house2");
        System.out.println();

        arrayBook.searchByYear(5);

    }

    private Book getRandomBook() {
        Book book = new Book();
        book.setId(id);
        book.setName("book" + (int) (Math.random() * 9 + 1));
        book.setAuthor("author" + (int) (Math.random() * 5 + 1));
        book.setPrice((int) (Math.random() * 9 + 1));
        book.setNumberOfPages("pages" + (int) (Math.random() * 9 + 1));
        book.setTypeOfBinding("type" + (int) (Math.random() * 9 + 1));
        book.setYearOfPublication((int) (Math.random() * 9 + 1));
        book.setPublishingHouse("house" + (int) (Math.random() * 9 + 1));
        return book;
    }
}
