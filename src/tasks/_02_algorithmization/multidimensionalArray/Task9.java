package tasks._02_algorithmization.multidimensionalArray;

import tasks.AbstractTask;
import tasks.Task;

public class Task9 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Задана матрица неотрицательных чисел.Посчитать сумму элементов в каждом столбце." +
                "\nОпределить, какой столбец содержит максимальную сумму.");
        System.out.println("array[m][n]");
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[][] arr = getMultiArray(m, n, 0, 9);
        printMultiArray(arr);
        System.out.println();


        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("столбец индекс " + i + " сумма " + sum);
            if (sum2 < sum) {
                sum2 = sum;
            }
        }
        System.out.println("мах сумма " + sum2);
    }
}
