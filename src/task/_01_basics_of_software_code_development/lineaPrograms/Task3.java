package task._01_basics_of_software_code_development.lineaPrograms;

import task.AbstractTask;
import task.Task;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вычислить значение выражения по формуле(все переменные принимают действительные значения)");
        System.out.print("x = ");
        int x = enterInt();
        System.out.print("y = ");
        int y = enterInt();

        double radianX;
        radianX = Math.toRadians(x);
        double radianY;
        radianY = Math.toRadians(y);
        double result;
        result = (Math.sin(radianX) + Math.cos(radianY))
                / (Math.cos(radianX) - Math.sin(radianY))
                * Math.tan(radianX * radianY);
        System.out.println(result);
    }
}
