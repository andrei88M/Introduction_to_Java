package tasks._01_basics_of_software_code_development.lineaPrograms;

import service.AbstractTask;
import service.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вычислить значение выражения по формуле(все переменные принимают действительные значения)");
        System.out.print("a = " );
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        double result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(result);
    }
}
