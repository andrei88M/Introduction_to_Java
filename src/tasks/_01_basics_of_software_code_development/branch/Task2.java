package tasks._01_basics_of_software_code_development.branch;

import service.AbstractTask;
import service.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Найти max{min(a,b), min(c,d)}");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        System.out.print("d = ");
        int d = scanner.nextInt();

        int min1, min2, max;
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }
        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        System.out.println(max);
    }
}
