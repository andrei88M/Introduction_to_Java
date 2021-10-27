package tasks._02_algorithmization.multidimensionalArray;

import tasks.AbstractTask;
import tasks.Task;

public class Task12 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Отсортировать строки матрицы по возростанию и убыванию значений элементов.");
        int[][] arr = getMultiArray(5, 6, 0, 9);
        printMultiArray(arr);
        System.out.println();

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length - 1; ) {
                if (arr[i][j] < arr[i + 1][j]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = temp;
                    i = 0;
                } else {
                    i++;
                }
            }
        }
        printMultiArray(arr);
        System.out.println();
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length - 1; ) {
                if (arr[i][j] > arr[i + 1][j]) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i + 1][j];
                    arr[i + 1][j] = temp;
                    i = 0;
                } else {
                    i++;
                }
            }
        }
        printMultiArray(arr);

    }

    private void sort() {

    }
}
