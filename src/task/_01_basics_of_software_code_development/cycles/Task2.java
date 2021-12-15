package task._01_basics_of_software_code_development.cycles;

import task.AbstractTask;
import task.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вычислить значение функции на отрезке[a,b] с шагом h");
        System.out.print("a = ");
        int a = enterInt();
        System.out.print("b = ");
        int b = enterInt();
        System.out.println("h = ");
        int h = enterInt();

        int y;
        for (int x = a; x <= b; x += h) {
            y = x > 2 ? x : -1 * x;
            System.out.println("y= " + y);
        }
    }
}
