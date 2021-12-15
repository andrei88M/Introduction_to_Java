package task._01_basics_of_software_code_development.lineaPrograms;

import task.AbstractTask;
import task.Task;

public class Task1 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Найдите значение функции: z = ((a - 3) * b / 2) + c");
        System.out.print("a = ");
        int a = enterInt();
        System.out.print("b = ");
        int b = enterInt();
        System.out.print("c = ");
        int c = enterInt();

        double z;
        z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }
}
