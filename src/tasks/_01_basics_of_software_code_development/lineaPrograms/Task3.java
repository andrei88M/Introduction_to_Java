package tasks._01_basics_of_software_code_development.lineaPrograms;

import service.AbstractTask;
import service.Task;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вычислить значение выражения по формуле(все переменные принимают действительные значения)");
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();

        double radianX = Math.toRadians(x);
        double radianY = Math.toRadians(y);
        double result = (Math.sin(radianX) + Math.cos(radianY))
                / (Math.cos(radianX) - Math.sin(radianY))
                * Math.tan(radianX * radianY);
        System.out.println(result);
    }
}
