package task._02_algorithmization.decomposition;

import task.AbstractTask;
import task.Task;

public class Task10 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дано натуральное число N. Написать метод(методы) для формирования массива," +
                "\nэлементами которого являются цифры числа N.");
        System.out.print("N = ");
        int n = enterInt();
        System.out.println(n);
        printArray(createArray(n));
    }

    private int[] createArray(int n) {
        int count = 0;
        for (int i = n; i > 0; i /= 10) {
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = n % 10;
            n = n /10;
        }
        return arr;
    }
}
