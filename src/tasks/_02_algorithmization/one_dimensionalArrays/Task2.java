package tasks._02_algorithmization.one_dimensionalArrays;

import service.AbstractTask;
import service.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дана последовательность действительных чисел." +
                " Заменить все ее члены, больше данного Z, этим числом." +
                "Подсчитать количество замен");
        System.out.print("size = ");
        int size = scanner.nextInt();
        double[] arr = getArray(size,0d,10d);
        printArray(arr);
        System.out.print("\nZ = ");
        int z = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        printArray(arr);
        System.out.println("\nколичество замен " + count);
    }
}
