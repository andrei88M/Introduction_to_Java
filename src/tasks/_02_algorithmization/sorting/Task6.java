package tasks._02_algorithmization.sorting;

import service.AbstractTask;
import service.Task;

public class Task6 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию." +
                "\nДелается это следующим образом: сравниваются два соседних элемента a^i и a^i+1." +
                "\nЕсли a^i <= a^i+1, то продвигаются на один элемент вперед.Если a^i>a^i+1, то производится перестановка" +
                "\nи сдвигаются на один элемент назад.Составить алгоритм этой сортировки.");
        int[] arr = getArray(10, 0, 9);
        printArray(arr);
        System.out.println();

        for (int i = 0; i < arr.length - 1; ) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i != 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        printArray(arr);
    }
}
