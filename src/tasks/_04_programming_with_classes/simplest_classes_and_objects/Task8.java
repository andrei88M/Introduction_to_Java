package tasks._04_programming_with_classes.simplest_classes_and_objects;

import tasks.Task;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task8.ArrayCustomer;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task8.Customer;

public class Task8 implements Task {
    private static int id = 1;
    @Override
    public void solving() {
        System.out.println("Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,\n" +
                "set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer,\n" +
                "с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.\n");
        ArrayCustomer arrayCustomer = new ArrayCustomer(5);
        arrayCustomer.add(getRandomCustomer());
        arrayCustomer.add(getRandomCustomer());
        arrayCustomer.add(getRandomCustomer());
        arrayCustomer.add(getRandomCustomer());
        arrayCustomer.add(getRandomCustomer());

        arrayCustomer.printCustomers();
        arrayCustomer.sort1();
        System.out.println();
        arrayCustomer.printCustomers();

        System.out.println();
        arrayCustomer.printCart(1,5);
    }

    private Customer getRandomCustomer() {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("name" + (int) (Math.random() * 9 + 1));
        customer.setSurname("surname" + (int) (Math.random() * 9 + 1));
        customer.setAddress("address" + (int) (Math.random() * 9 + 1));
        customer.setNumberBankAccount((int) (Math.random() * 9 + 1));
        customer.setNumberCart((int) (Math.random() * 9 + 1));
        id++;
        return customer;
    }
}
