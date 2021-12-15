package task._01_basics_of_software_code_development.branch;

import task.AbstractTask;
import task.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Найти max{min(a,b), min(c,d)}");
        System.out.print("a = ");
        int a = enterInt();
        System.out.print("b = ");
        int b = enterInt();
        System.out.print("c = ");
        int c = enterInt();
        System.out.print("d = ");
        int d = enterInt();

        int minAB, minCD, max;
        if (a < b) {
            minAB = a;
        } else {
            minAB = b;
        }
        if (c < d) {
            minCD = c;
        } else {
            minCD = d;
        }
        if (minAB > minCD) {
            max = minAB;
        } else {
            max = minCD;
        }
        System.out.println(max);
    }
}
