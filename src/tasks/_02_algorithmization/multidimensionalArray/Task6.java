package tasks._02_algorithmization.multidimensionalArray;

import service.AbstractTask;
import service.Task;

public class Task6 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Сформировать квадратную матрицу по заданному образцу" +
                "\n1   1   1   ...   1   1   1" +
                "\n0   1   1   ...   1   1   0" +
                "\n0   0   1   ...   1   0   0" +
                "\n..........................." +
                "\n0   0   1   ...   1   0   0" +
                "\n0   1   1   ...   1   1   0" +
                "\n1   1   1   ...   1   1   1\n");

        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i <= arr.length / 2) {
                    if (j <= i || j >= arr.length - i - 1)
                        arr[i][j] = 1;
                } else {
                    if (j <= arr.length - i - 1 || j >= i)
                        arr[i][j] = 1;
                }
            }
        }
        printMultiArray(arr);
    }
}
