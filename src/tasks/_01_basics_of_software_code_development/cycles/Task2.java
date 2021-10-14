package tasks._01_basics_of_software_code_development.cycles;

import service.AbstractTask;
import service.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вычислить значение функции на отрезке[a,b] с шагом h");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.println("h = ");
        int h = scanner.nextInt();

        int y;
        for (int x = a; x <= b; x += h) {
            y = x > 2 ? x : -1 * x;
            System.out.println("y= " + y);
        }
    }
}
