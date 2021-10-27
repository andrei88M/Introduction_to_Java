package tasks._01_basics_of_software_code_development.branch;

import tasks.AbstractTask;
import tasks.Task;

public class Task1 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны два угла треугольника (в градусах).Определить, существует ли такой треугольник," +
                "\nи если да, то будет ли он прямоугольным.");
        System.out.print("угол1 = ");
        int angle1 = scanner.nextInt();
        System.out.print("угол2 = ");
        int angle2 = scanner.nextInt();

        if (angle1 + angle2 < 180) {
            if (angle1 == 90 || angle2 == 90 || angle1 + angle2 == 90) {
                System.out.println("треугольник прямоугольный");
                return;
            }
            System.out.println("треугольник существует");
        } else {
            System.out.println("треугольника не существует");
        }
    }
}
