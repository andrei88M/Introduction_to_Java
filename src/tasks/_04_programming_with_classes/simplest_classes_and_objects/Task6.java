package tasks._04_programming_with_classes.simplest_classes_and_objects;

import tasks.Task;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task6.Clock;

public class Task6 implements Task {
    @Override
    public void solving() {
        System.out.println("Составьте описание класса для представления времени. Предусматрите возможности\n" +
                "установки времени и изменения его отдельных полей(час, минута, секунда) с проверкой допустимости\n" +
                "вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.\n" +
                "Создать методы изменения времени на заданное количество часов, минут и секунд.");
        Clock clock = new Clock(1, 61, 61);
        clock.printTime();
        clock.change(1,-1,61);
        clock.printTime();
    }
}
