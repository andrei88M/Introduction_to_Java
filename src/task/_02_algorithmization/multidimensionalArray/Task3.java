package task._02_algorithmization.multidimensionalArray;

import task.AbstractTask;
import task.Task;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дана матрица. Вывести k-ую строку и р-ый столбец.");
        System.out.println("array[i][j]");
        System.out.print("i = ");
        int m = enterInt(1, Integer.MAX_VALUE);
        System.out.print("j = ");
        int n = enterInt(1, Integer.MAX_VALUE);
        System.out.print("k = ");
        int k = enterInt(0, n-1);
        System.out.print("p = ");
        int p = enterInt(0, m-1);
        int[][] arr = createMultiArray(m, n, 0, 9);
        printMultiArray(arr);
        System.out.println();

        for (int[] ints : arr) {
            System.out.print(ints[k] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < arr[p].length; i++) {
            System.out.println(arr[p][i]);
        }
    }
}
