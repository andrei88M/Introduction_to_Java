package task._02_algorithmization.multidimensionalArray;

import task.AbstractTask;
import task.Task;

public class Task13 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Отсортировать столбцы матрицы по возростанию и убыванию значений элементов");
        int[][] arr = createMultiArray(5, 6, 0, 9);
        printMultiArray(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; ) {
                if (arr[i][j] > arr[i][j + 1]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = temp;
                    i = 0;
                } else {
                    j++;
                }
            }
        }
        printMultiArray(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; ) {
                if (arr[i][j] < arr[i][j + 1]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = temp;
                    i = 0;
                } else {
                    j++;
                }
            }
        }
        printMultiArray(arr);
        System.out.println();
    }
}
