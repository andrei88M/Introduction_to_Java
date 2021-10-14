package tasks._01_basics_of_software_code_development.cycles;

import service.AbstractTask;
import service.Task;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Найти сумму квадратов первых ста чисел.");
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i * i;
        }
        System.out.println(result);
    }
}
