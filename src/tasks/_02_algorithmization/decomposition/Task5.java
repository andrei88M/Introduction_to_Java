package tasks._02_algorithmization.decomposition;

import tasks.AbstractTask;
import tasks.Task;

public class Task5 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Составить программу, которая в массиве A[N] находит второе по величине число(вывести на печать число," +
                "\nкоторое меньше максимального элемента массива, но больше всех других элементов).");
        int[] arr = getArray(10, 0, 100);
        printArray(arr);
        System.out.println();

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) continue;
            if (max2 < arr[i]) max2 = arr[i];
        }
        System.out.println(max2);
    }
}
