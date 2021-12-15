package task._02_algorithmization.multidimensionalArray;

import task.AbstractTask;
import task.Task;

public class Task14 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Cформировать случайную матрицу mхn, состоящую из нулей и едениц, причем в каждом" +
                "\nстолбце число единиц равно номеру столбца");
        int m;
        int n;
        int[][] arr;
        System.out.print("m = ");
        m = enterInt(1, Integer.MAX_VALUE);
        System.out.print("n = ");
        n = enterInt(1, Integer.MAX_VALUE);
        arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            int quantity1 = i;
            int quantity0 = arr.length - 1 - i;
            for (int j = 0; j < arr[i].length; j++) {
                if (quantity0 > 0 && quantity1 > 0) {
                    arr[i][j] = (int) (Math.random() * 2);
                } else if (quantity1 > 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }

                if (arr[i][j] == 0) {
                    quantity0--;
                } else if (arr[i][j] == 1) {
                    quantity1--;
                }
            }
        }
        printMultiArray(arr);
    }
}
