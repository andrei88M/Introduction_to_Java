package tasks._01_basics_of_software_code_development.branch;

import service.AbstractTask;
import service.Task;

public class Task4 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича." +
                "\nОпределить, пройдет ли кирпич через отверстие");
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.println("z = ");
        int z = scanner.nextInt();

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
