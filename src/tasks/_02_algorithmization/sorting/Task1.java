package tasks._02_algorithmization.sorting;

import tasks.AbstractTask;
import tasks.Task;

public class Task1 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Заданы два одномерных массива с различным количеством элементов и натуральное число k." +
                "\nОбъеденить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого," +
                "\nпри этом не используя дополнительный массив");
        int size1 = (int) (Math.random() * 9 + 2);
        int size2 = (int) (Math.random() * 8 + 1);
        System.out.println("array1[" + size1 + "]");
        int[] array1 = getArray(size1, 1, 9);
        printArray(array1);
        System.out.println("\narray2[" + size2 + "]");
        int[] array2 = getArray(size2, -9, -1);
        printArray(array2);
        int k = (int) (Math.random() * (size1 - 1));
        System.out.println("\nk = " + k);

        for (int i = 0; i < array1.length; i++) {
            if (i <= k) continue;
            for (int j = 0; j < array2.length && i < array1.length; j++, i++) {
                int temp = array1[i];
                array1[i] = array2[j];
                array2[j] = temp;
            }
            for (int p = 0; p < array2.length && i < array1.length; p++,i++) {
                array1[i] = array2[p];
            }
        }
        printArray(array1);

    }
}
