package tasks._02_algorithmization.multidimensionalArray;

import tasks.AbstractTask;
import tasks.Task;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дана матрица. Вывести k-ую строку и р-ый столбец.");
        System.out.println("array[i][j]");
        System.out.print("i = ");
        int m = scanner.nextInt();
        System.out.print("j = ");
        int n = scanner.nextInt();
        System.out.print("k = ");
        int k = scanner.nextInt();
        System.out.print("p = ");
        int p = scanner.nextInt();
        int[][] arr = getMultiArray(m, n, 0, 9);
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
