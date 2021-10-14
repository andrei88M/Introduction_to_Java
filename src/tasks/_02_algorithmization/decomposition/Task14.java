package tasks._02_algorithmization.decomposition;

import service.AbstractTask;
import service.Task;

public class Task14 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр," +
                "\nвозведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k." +
                "\nДля решения задачи использовать декомпозицию.");
        System.out.print("k = ");
        int k = scanner.nextInt();

        for (int i = 1; i <= k; i++) {
            if (search(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean search(int number) {
        int count = 0;
        int sum = 0;
        int numb = number;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
            count++;
        }
        return Math.pow(sum, count) == numb;
    }
}
