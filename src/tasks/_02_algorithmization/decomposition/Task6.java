package tasks._02_algorithmization.decomposition;

import tasks.AbstractTask;
import tasks.Task;

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
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        System.out.println(search(a, b, c));
    }
}
