package task._02_algorithmization.one_dimensionalArrays;

import task.AbstractTask;
import task.Task;

public class Task1 extends AbstractTask implements Task {

    @Override
    public void solving() {
        System.out.println("В массив A[N] занесены натуральные числа. Найти сумму тех элементов, каторые кратны данному K");
        System.out.print("size = ");
        int size = enterInt(1, Integer.MAX_VALUE);
        System.out.print("K = ");
        int k = enterInt(1, Integer.MAX_VALUE);
        int[] arr = createArray(size, 1, 100);
        printArray(arr);

        int sum = 0;
        System.out.print("\nsum = ");
        for (int j : arr) {
            if (j % k == 0) {
                sum += j;
                System.out.print(j + " + ");
            }
        }
        System.out.println("= " + sum);
    }
}
