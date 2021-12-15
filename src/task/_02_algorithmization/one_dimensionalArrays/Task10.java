package task._02_algorithmization.one_dimensionalArrays;

import task.AbstractTask;
import task.Task;

public class Task10 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дан целочисленный массив с количеством элементов n. " +
                "Сжать массив, выбросив из него каждый второй элемент(освободившиеся элементы заполнить нулями).Дополнительный массив не использовать.");
        System.out.print("size = ");
        int size = enterInt(1, Integer.MAX_VALUE);
        int[] arr = createArray(size, 0, 10);
        printArray(arr);
        System.out.println();

        int j = 2;
        for (int i = 1; i < arr.length; i++) {
            if (j < arr.length) {
                arr[i] = arr[j];
            } else {
                arr[i] = 0;
            }
            j += 2;
        }
        printArray(arr);
    }
}
