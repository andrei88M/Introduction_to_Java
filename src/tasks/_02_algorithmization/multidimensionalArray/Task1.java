package tasks._02_algorithmization.multidimensionalArray;

import service.AbstractTask;
import service.Task;

import java.util.Arrays;

public class Task1 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего");
        System.out.println("array[i][j]");
        System.out.print("i = ");
        int m = scanner.nextInt();
        System.out.print("j = ");
        int n = scanner.nextInt();
        int[][] arr = getMultiArray(m, n, 0, 10);
        System.out.println(Arrays.deepToString(arr));

        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i][0] > arr[i][arr[i].length - 1]) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
