package tasks._02_algorithmization.one_dimensionalArrays;

import service.AbstractTask;
import service.Task;

public class Task6 extends AbstractTask implements Task {

    private boolean checkPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void solving() {
        System.out.println("Задана последовательность вещественных чисел." +
                " Вычеслить сууму чисел порядковый номер каторых простые числа");
        System.out.print("size = ");
        int size = scanner.nextInt();
        double[] arr = getArray(size, -10d, 10d);
        printArray(arr);
        System.out.println();

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrimeNumber(i)) {
                sum += arr[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}
