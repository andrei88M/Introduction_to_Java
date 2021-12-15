package task._02_algorithmization.multidimensionalArray;

import task.AbstractTask;
import task.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дана квадратная матрица. Вывести элементы стоящие на диоганали.");
        System.out.println("array[i][i]");
        System.out.print("i = ");
        int m = enterInt(1, Integer.MAX_VALUE);
        int[][] arr = createMultiArray(m, m, 0, 9);
        printMultiArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
            System.out.println(arr[arr.length - 1 - i][i] + " ");
        }
    }
}
