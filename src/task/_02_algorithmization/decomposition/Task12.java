package task._02_algorithmization.decomposition;

import task.AbstractTask;
import task.Task;

public class Task12 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны натуральные числа K и N. Написать метод(методы) формирования массива A," +
                "\nэлементами которого являются числа, сумма цифр которых равна K и которые не больше N.");
        System.out.print("K = ");
        int k = enterInt(1, Integer.MAX_VALUE);
        System.out.print("N = ");
        int n = enterInt(1, Integer.MAX_VALUE);

        printArray(createArray(k, n));
    }

    private int[] createArray(int k, int n) {
        int size = n - (k - n) + 1;
        int[] arr = new int[size];
        int j = 0;
        for (int i = k - n; i <= n; i++) {
            arr[j] = i;
            j++;
        }
        return arr;
    }
}
