package task._01_basics_of_software_code_development.branch;

import task.AbstractTask;
import task.Task;

public class Task4 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича." +
                "\nОпределить, пройдет ли кирпич через отверстие");
        System.out.print("A = ");
        int a = enterInt(1,Integer.MAX_VALUE);
        System.out.print("B = ");
        int b = enterInt(1,Integer.MAX_VALUE);
        System.out.print("x = ");
        int x = enterInt(1,Integer.MAX_VALUE);
        System.out.print("y = ");
        int y = enterInt(1,Integer.MAX_VALUE);
        System.out.print("z = ");
        int z = enterInt(1,Integer.MAX_VALUE);

        if ((a > x && b > y)
                || (a > y && b > x)
                || (a > x && b > z)
                || (a > z && b > x)
                || (a > y && b > z)
                || (a > z && b > y)) {
            System.out.println("кирпич пролезет");
        } else {
            System.out.println("кирпич не пролезет");
        }
    }
}
