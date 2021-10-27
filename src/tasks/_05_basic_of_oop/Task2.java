package tasks._05_basic_of_oop;

import tasks.Task;
import tasks._05_basic_of_oop.task2.Payment;

public class Task2 implements Task {
    @Override
    public void solving() {
        System.out.println("Создать класс Payment с внутренним классом, с помощью объектов которого можно\n" +
                "сформировать покупку из нескольких товаров.");
        Payment payment = new Payment();
        payment.add("car",10);
        payment.add("lol",11);
        payment.pay();
    }
}
