package tasks._01_basics_of_software_code_development.lineaPrograms;

import tasks.AbstractTask;
import tasks.Task;

public class Task1 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Найдите значение функции: z = ((a - 3) * b / 2) + c");
        System.out.print("a = " );
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }
}
