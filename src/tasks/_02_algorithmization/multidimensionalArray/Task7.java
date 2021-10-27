package tasks._02_algorithmization.multidimensionalArray;

import tasks.AbstractTask;
import tasks.Task;

public class Task7 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Сформировать квадратную матрицу порядка N по правилу" +
                "\nA[I,J] = sin( (I*I - J*J) / N)");
        System.out.println("array[n][n]");
        System.out.print("n = ");
        int n = scanner.nextInt();
        double[][] arr = new double[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                double rad = Math.toRadians((i * i - j * j) / (double) n);
                arr[i][j] = Math.sin(rad);
            }
        }
        printMultiArray(arr);
    }
}
