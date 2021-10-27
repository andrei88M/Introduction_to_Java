package tasks._01_basics_of_software_code_development.cycles;

import tasks.AbstractTask;
import tasks.Task;

public class Task7 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Для каждого натурального числа в промежутке от m до n вывести все делители," +
                "\nкроме единицы и самого числа.");
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.print("число " + i + " его делители ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}
