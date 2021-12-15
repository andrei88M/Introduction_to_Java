package task._02_algorithmization.multidimensionalArray;

import task.AbstractTask;
import task.Task;

public class Task10 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Найти положительные элементты главной диагонали квадратной матрицы.");
        int[][] arr = createMultiArray(5,5, -5,5);
        printMultiArray(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) {
                System.out.println(arr[i][i]);
            }
        }
    }
}
