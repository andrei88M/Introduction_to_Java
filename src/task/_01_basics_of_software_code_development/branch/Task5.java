package task._01_basics_of_software_code_development.branch;

import task.AbstractTask;
import task.Task;

public class Task5 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вычислить значение функции\n" +
                "   x*x - 3*x + 9   eсли x <= 3\n" +
                "   1/(x + 6)    если x>3");
        System.out.print("x = ");
        int x = enterInt();

        double result;
        if (x <= 3) {
            result = x * x - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(result);
    }
}
