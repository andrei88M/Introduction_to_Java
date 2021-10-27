package tasks._04_programming_with_classes.simplest_classes_and_objects;

import tasks.AbstractTask;
import tasks.Task;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task1.Test1;

public class Task1 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих\n" +
                "переменных. Добавьте метод, который находит сумму этих переменных, и метод, который находит\n" +
                "наибольшее значение из этих двух переменных.");

        Test1 test1 = new Test1();
        test1.setNumb1(1);
        test1.setNumb2(2);
        System.out.println(test1.getNumb1());
        System.out.println(test1.getNumb2());
        test1.printSum();
        test1.printMax();
    }
}
