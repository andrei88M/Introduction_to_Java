package task._02_algorithmization.multidimensionalArray;

import task.AbstractTask;
import task.Task;

public class Task5 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Сформировать квадратную матрицу по задоннаму образцу." +
                "\n1   1   ...   1   1   1   " +
                "\n2   2   ...   2   2   0   " +
                "\n3   3   ...   3   0   0   " +
                "\n....................      " +
                "\nn-1 n-1 ...   0   0   0   " +
                "\nn   0   ...   0   0   0   \n");
        System.out.println("array[i][i]");
        System.out.print("i = ");
        int m = enterInt(1, Integer.MAX_VALUE);
        int[][] arr = new int[m][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++) {
                arr[i][j] = j + 1;
            }
        }
        printMultiArray(arr);
    }
}
