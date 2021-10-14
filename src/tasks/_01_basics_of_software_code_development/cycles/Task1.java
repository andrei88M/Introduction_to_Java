package tasks._01_basics_of_software_code_development.cycles;

import service.AbstractTask;
import service.Task;

public class Task1 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.print("Напишите программу, где пользователь вводит любое целое положительное число." +
                "\nА программа суммирует все числа от 1 до введенного пользователем числа.");
        int number;
        int result = 0;
        do {
            System.out.println("введите целое положительное число");
            number = scanner.nextInt();
        } while (number <= 0);

        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
