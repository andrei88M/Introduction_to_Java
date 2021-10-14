package tasks._02_algorithmization.one_dimensionalArrays;

import service.AbstractTask;
import service.Task;

public class Task7 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны действительные числа a^1, a^2 ... a^n." +
                " Найти max(a^1 + a^(2*n), a^2 + a^(2*n-1), ... ,  a^n + a^(n+1))");

    }
}
