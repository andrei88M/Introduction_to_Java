package task._02_algorithmization.sorting;

import task.AbstractTask;
import task.Task;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Cортировка выбором.Дана последовательность чисел а1 <= a2 <= ... <= a^n." +
                "\nТребуется переставить элементы так, чтобы они были расположены по убыванию." +
                "\nДля этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место," +
                "\nа первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется." +
                "\nНаписать алгоритм сортировки выбором.");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        printArray(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[index] = temp;
        }
        printArray(arr);
    }
}
