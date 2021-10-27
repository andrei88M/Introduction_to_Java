package tasks._02_algorithmization.decomposition;

import tasks.AbstractTask;
import tasks.Task;

public class Task13 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Два простых числа называются близнецами, если они отличаются друг от друга на 2" +
                "\n(например , 41 и 43). Найти и напечатать все пары близнецов из отрезка [n, 2n], где " +
                "\nn - заданное натуральное число больше 2.Для решения задачи использовать декомпозицию.");
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] arr = getArray(n * 2, 0, 9);
        printArray(arr);
        System.out.println();

        search(n, arr);
    }

    private void search(int n, int[] arr) {
        for (int i = n; i < n * 2; i++) {
            for (int j = i; j < n * 2; j++) {
                if (arr[i] == arr[j] - 2 || arr[i] == arr[j] + 2){
                    System.out.println(arr[i] + "  " + arr[j]);
                }
            }
        }
    }

}
