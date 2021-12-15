package task._04_programming_with_classes.simplest_classes_and_objects;

import task.AbstractTask;
import task.Task;
import task._04_programming_with_classes.simplest_classes_and_objects.task2.Teast2;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Cоздайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,\n" +
                " инициализирующий члены по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.");

        Teast2 teast2 = new Teast2();
        teast2.setNumb1(1);
        teast2.setNumb2(2);
        teast2 = new Teast2(1, 2);
    }
}
