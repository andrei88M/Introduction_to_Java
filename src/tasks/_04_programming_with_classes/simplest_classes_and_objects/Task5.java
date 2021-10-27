package tasks._04_programming_with_classes.simplest_classes_and_objects;

import tasks.Task;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task5.Counter;

public class Task5 implements Task {
    @Override
    public void solving() {
        System.out.println("Опишите класс, реализующий десятичный счетчик, который может увеличивать или\n" +
                "уменьшать свое значение на единицу в заданном диапазоне. Предусматреть инициализацию счетчика \n" +
                "значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения\n" +
                "состояния, и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий\n" +
                "все возможности класса.\n");
        Counter counter = new Counter();
        counter.enlarge();
        counter.decrease();
        counter.decrease();
        counter.printResult();
    }
}
