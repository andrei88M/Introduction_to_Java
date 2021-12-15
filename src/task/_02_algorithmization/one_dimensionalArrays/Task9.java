package task._02_algorithmization.one_dimensionalArrays;

import task.AbstractTask;
import task.Task;

public class Task9 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. " +
                "Если таких чисел несколько, то определить наименьшее из них.");
        System.out.print("size = ");
        int size = enterInt(1, Integer.MAX_VALUE);
        int[] arr = createArray(size, 0, 10);
        printArray(arr);
        System.out.println();

        int number = arr[0];
        int count = 1;
        int count2 = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > count2) {
                count2 = count;
                number = arr[i];
            } else if (count == count2) {
                if (arr[i] < number) {
                    number = arr[i];
                }
            }
            count = 1;
        }
        System.out.println(number);
    }
}
