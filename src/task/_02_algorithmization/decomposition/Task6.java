package task._02_algorithmization.decomposition;

import task.AbstractTask;
import task.Task;

public class Task6 extends AbstractTask implements Task {
    private String search(int a, int b, int c) {
        for (int i = 2; i <= a && i <= b && i <= c; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                return "числа не взаимно простые";
            }
        }
        return "числа взаимно простые";
    }

    @Override
    public void solving() {
        System.out.println("Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми");
        System.out.print("a = ");
        int a = enterInt();
        System.out.print("b = ");
        int b = enterInt();
        System.out.print("c = ");
        int c = enterInt();
        System.out.println(search(a, b, c));
    }
}
