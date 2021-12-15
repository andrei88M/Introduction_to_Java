package task._02_algorithmization.decomposition;

import task.AbstractTask;
import task.Task;

public class Task3 extends AbstractTask implements Task {
    private double getArea(int a) {
        return 3 * Math.sqrt(3) * a * a / 2;
    }

    @Override
    public void solving() {
        System.out.println("Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.");
        System.out.print("Cторона правильного шестиуголька равна ");
        int a = enterInt(0, Integer.MAX_VALUE);
        System.out.println("Площадь правильного шестиугольника " + getArea(a));
    }
}
