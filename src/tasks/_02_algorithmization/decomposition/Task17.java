package tasks._02_algorithmization.decomposition;

import service.Task;

public class Task17 implements Task {
    @Override
    public void solving() {
        System.out.println("Из данного числа вычли сумму его цифр.Из результата вновь вычли сумму его цифр и т.д." +
                "\nСколько таких действий надо произвести, чтобы получитьнуль?Для решения задачи использовать декомпозицию.");
    }
}
