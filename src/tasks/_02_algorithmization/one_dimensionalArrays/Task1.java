package tasks._02_algorithmization.one_dimensionalArrays;

import tasks.AbstractTask;
import tasks.Task;

public class Task1 extends AbstractTask implements Task {

    @Override
    public void solving() {
        System.out.println("В массив A[N] занесены натуральные числа. Найти сумму тех элементов, каторые кратны данному K");
        System.out.print("size = ");
        int size = scanner.nextInt();
        System.out.print("K = ");
        int k = scanner.nextInt();
        int[] arr = getArray(size, 1, 100);
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
