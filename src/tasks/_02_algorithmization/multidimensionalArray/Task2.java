package tasks._02_algorithmization.multidimensionalArray;

import tasks.AbstractTask;
import tasks.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дана квадратная матрица. Вывести элементы стоящие на диоганали.");
        System.out.println("array[i][j]");
        System.out.print("i = ");
        int m = scanner.nextInt();
        System.out.print("j = ");
        int n = scanner.nextInt();
        int[][] arr = getMultiArray(m,n,0,9);
        printMultiArray(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
            System.out.println(arr[arr.length - 1 - i][i] + " ");
        }
    }
}
