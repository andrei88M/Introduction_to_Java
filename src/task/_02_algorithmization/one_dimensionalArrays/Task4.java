package task._02_algorithmization.one_dimensionalArrays;

import task.AbstractTask;
import task.Task;

public class Task4 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны действительные числа." +
                " Поменять местами наибольший и наименьший элементы");
        System.out.print("size = ");
        int size = enterInt(1, Integer.MAX_VALUE);
        double[] arr = createArray(size, -10d, 10d);
        printArray(arr);

        int max = 0, min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        double temp = arr[max];
        arr[max] = arr[min];
        arr[min] = temp;
        System.out.println();
        printArray(arr);
    }
}
