package tasks._02_algorithmization.decomposition;

import service.AbstractTask;
import service.Task;

public class Task12 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны натуральные числа K и N. Написать метод(методы) формирования массива A," +
                "\nэлементами которого являются числа, сумма цифр которых равна K и которые не больше N.");
        System.out.print("K = ");
        int k = scanner.nextInt();
        System.out.print("N = ");
        int n = scanner.nextInt();

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
