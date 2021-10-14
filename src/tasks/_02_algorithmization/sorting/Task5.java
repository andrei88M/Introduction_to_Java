package tasks._02_algorithmization.sorting;

import service.AbstractTask;
import service.Task;

public class Task5 extends AbstractTask implements Task {
    private static int index;

    @Override
    public void solving() {
        System.out.println("Сортировка вставками. Дана последовательность чисел а1, а2, ... , а^n." +
                "\nТребуется переставить числа в порядке возрастания.Делается это следующим образом." +
                "\nПусть а1,а2, ... ,а^i - упорядочная последовательность , т.е. а1 <= a2 <= ... <= a^n." +
                "\nБерется следующее число а^i+1 и вставляется в последовательность так," +
                "\nчтобы новая последовательность была тоже возрастающей.Процесс производится до тех пор," +
                "\nпока все элементы от i+1 до n не будут перебраны.Примечание.Место помещегия очередного " +
                "\nэлемента в отсортированную часть производить с помощью двоичного поиска." +
                "\nДвоичный поиск оформить в виде отдельной функции.");
        int[] arr = getArray(10, 0, 9);
        printArray(arr);
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) continue;
            binarySearch(arr, 0, i, i + 1);
            swap(arr, index, i + 1);
        }
        printArray(arr);
    }

    private void binarySearch(int[] array, int from, int to, int key) {
        if (from < to) {
            int middle = from + (to - from) / 2;
            if (array[key] < array[middle]) {
                to = middle - 1;
            } else if (array[key] > array[middle]) {
                from = middle + 1;
            } else {
                index = middle;
                return;
            }
            binarySearch(array, from, to, key);
        } else {
            if (array[from] < array[key]) {
                index = from + 1;
            } else {
                index = from;
            }
        }
    }

    private void swap(int[] array, int index, int key) {
        for (int i = index; i < key; i++) {
            int temp = array[i];
            array[i] = array[key];
            array[key] = temp;
        }
    }
}
