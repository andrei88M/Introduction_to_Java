package tasks._02_algorithmization.sorting;

import tasks.AbstractTask;
import tasks.Task;

public class Task4 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Сортировка обменами. Дана последовательность чисел а1 <= a2 <= ... <= a^n" +
                "\nТребуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа а^i и а^i+1" +
                "\nЕсли а^i > a^i+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут" +
                "\nрасположены в порядке возрастания. Составить алгоритм сортиовки, подсчитывая при этом количества перестановок");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        printArray(arr);
        System.out.println();

        int count = 0;
        boolean boll = true;
        while (boll) {
            boll =false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    boll = true;
                    count++;
                }
            }
        }
        printArray(arr);
        System.out.println("  count "  +count);
    }
}
