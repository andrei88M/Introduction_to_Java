package task._02_algorithmization.multidimensionalArray;

import task.AbstractTask;
import task.Task;

public class Task15 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Найдите наибольший элемент матрицы и замените все нечетные элементы на него");
        int[][] arr = createMultiArray(5, 5, 0, 9);
        printMultiArray(arr);
        System.out.println();

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 != 0){
                    arr[i][j] = max;
                }
            }
        }
        printMultiArray(arr);
    }
}
