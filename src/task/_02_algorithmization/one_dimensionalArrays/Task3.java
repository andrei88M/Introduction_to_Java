package task._02_algorithmization.one_dimensionalArrays;

import task.AbstractTask;
import task.Task;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дан массив действительных чисел, размерностью N." +
                " Посчитать положительные, отрицательные и нулевые элемменты");
        System.out.print("size = ");
        int size = enterInt(1, Integer.MAX_VALUE);
        double[] arr = createArray(size, -10d, 10d);
        printArray(arr);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (double numb : arr) {
            if (numb > 0) {
                positive++;
            } else if (numb < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("\npositive " + positive + "\nnegative " + negative + "\nzero " + zero);
    }
}
