package tasks._01_basics_of_software_code_development.branch;

import service.AbstractTask;
import service.Task;

public class Task5 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вычислить значение функции");
        System.out.print("x = ");
        int x = scanner.nextInt();

        double result;
        if (x <= 3) {
            result = x * x - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(result);
    }
}
