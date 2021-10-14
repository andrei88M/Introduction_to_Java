package tasks._01_basics_of_software_code_development.branch;

import service.AbstractTask;
import service.Task;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны три точки A(x1,y1), B(x2,y2) и C(x3,y3).Определить, будут ли они расположены на одной прямой.");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();
        System.out.print("x3 = ");
        int x3 = scanner.nextInt();
        System.out.print("y3 = ");
        int y3 = scanner.nextInt();

        int ax = Math.abs(x2 - x1);
        int ay = Math.abs(y2 - y1);
        int bx = Math.abs(x3 - x1);
        int by = Math.abs(y3 - y1);
        if (ax / ay == bx / by) {
            System.out.println("точки на одной прямой");
        } else {
            System.out.println("точки не на одной прямой");
        }
    }
}
