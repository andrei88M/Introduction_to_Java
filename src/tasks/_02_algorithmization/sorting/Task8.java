package tasks._02_algorithmization.sorting;

import tasks.AbstractTask;
import tasks.Task;

import java.util.Arrays;

public class Task8 extends AbstractTask implements Task {
    private void print(int[] p, int[] q) {
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + "/" + q[i] + "  ");
        }
    }

    @Override
    public void solving() {
        System.out.println("Даны дроби p^1/q^1, p^2/q^2, ... , p^n/q^n (p^i, q^i - натуральные). Составить программу," +
                "\nкоторая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.");
        int[] p = getArray(10, 0, 10);
        int[] q = getArray(10, 1, 9);
        print(p, q);

        int denominator = 1;
        for (int i = 0; i < q.length; i++) {
            denominator *= q[i];
        }
        for (int i = 0; i < p.length; i++) {
            p[i] = p[i] * (denominator / q[i]);
        }
        Arrays.fill(q, denominator);
        Arrays.sort(p);
        System.out.println();
        print(p, q);
    }
}
