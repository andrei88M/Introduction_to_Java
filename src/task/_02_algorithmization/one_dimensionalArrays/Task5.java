package task._02_algorithmization.one_dimensionalArrays;

import task.AbstractTask;
import task.Task;

public class Task5 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны целые числа a^1, a^2 ... a^i." +
                " Вывести на печать a^i > i");
        System.out.print("size = ");
        int size = enterInt();
        int[] arr = createArray(size,-10, 10);
        printArray(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.print(" " + arr[i]);
            }
        }
    }
}
