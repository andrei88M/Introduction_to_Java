package task._01_basics_of_software_code_development.lineaPrograms;

import task.AbstractTask;
import task.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вычислить значение выражения по формуле(все переменные принимают действительные значения)");
        System.out.print("a = ");
        int a = enterInt();
        System.out.print("b = ");
        int b = enterInt();
        System.out.print("c = ");
        int c = enterInt();

        int x = 2 * a;
        if (x == 0) {
            System.out.println("делить на ноль нельзя");
            return;
        }
        double result;
        result = (b + Math.sqrt(b * b + 4 * a * c)) / x - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(result);
    }
}
