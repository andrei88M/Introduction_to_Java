package task._02_algorithmization.one_dimensionalArrays;

import task.AbstractTask;
import task.Task;

public class Task8 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дана последовательность целых чисел. " +
                " Найти min , создать новую числовую последовательность выбросив min");
        System.out.print("size = ");
        int size = enterInt(1, Integer.MAX_VALUE);
        int[] arr = createArray(size, -10, 10);
        printArray(arr);
        System.out.println();

        int min = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                count = 1;
            } else if (min == arr[i]) {
                count++;
            }
        }
        int[] arr2 = new int[size - count];
        int j = 0;
        for (int k : arr) {
            if (k != min) {
                arr2[j] = k;
                j++;
            }
        }
        printArray(arr2);
    }
}
