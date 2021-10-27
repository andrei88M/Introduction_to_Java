package tasks._02_algorithmization.decomposition;

import tasks.AbstractTask;
import tasks.Task;

public class Task17 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Из данного числа вычли сумму его цифр.Из результата вновь вычли сумму его цифр и т.д." +
                "\nСколько таких действий надо произвести, чтобы получить нуль?Для решения задачи использовать декомпозицию.");
        System.out.print("number = ");
        int number = scanner.nextInt();
        printQuantuty(number);
    }

    private void printQuantuty(int number) {
        int count = 0;
        while (number != 0) {
            number -= getSum(number);
            count++;
        }
        System.out.println(count);
    }

    private int getSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
