package tasks._02_algorithmization.multidimensionalArray;

import tasks.AbstractTask;
import tasks.Task;

public class Task4 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Сформировать квадратную матрицу порядка n по задоннаму образцу." +
                "\n1   2   3   ...   n" +
                "\nn   n-1 n-2 ...   1" +
                "\n1   2   3   ...   n" +
                "\nn   n-1 n-2 ...   1" +
                "\n..................." +
                "\nn   n-1 n-2 ...   1\n");

        int[][] arr = new int[9][9];
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (j % 2 == 0) {
                    arr[i][j] = i + 1;
                } else {
                    arr[i][j] = arr.length - i;
                }
            }
        }
        printMultiArray(arr);
    }
}
