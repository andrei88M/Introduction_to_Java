package task._02_algorithmization.decomposition;

import task.AbstractTask;
import task.Task;

public class Task8 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Задан массив D. Определить следующие суммы:" +
                "\nD[1] + D[2] + D[3]; " +
                "\nD[3] + D[4} + D[5];" +
                "\nD[4] + D[5] + D[6]." +
                "\nПояснение.Составить метод(методы) для вычисления суммы трех последовательно" +
                "\nрасположенных элементов массива с номерами от k до m.");
        int[] arr = createArray(10, 0, 10);
        printArray(arr);

        System.out.println(getSumThreeElements(arr,0));
        System.out.println(getSumThreeElements(arr,3));
        System.out.println(getSumThreeElements(arr, 4));

    }

    private int getSumThreeElements(int[] arr, int indexOneElement) {
        int sum = 0;
        for (int i = indexOneElement; i <= indexOneElement + 2 && indexOneElement < arr.length - 3; i++) {
            sum +=  arr[i];
        }
        return sum;
    }
}
