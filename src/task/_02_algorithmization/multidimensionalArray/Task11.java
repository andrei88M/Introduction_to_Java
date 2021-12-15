package task._02_algorithmization.multidimensionalArray;

import task.AbstractTask;
import task.Task;

public class Task11 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Матрицу 10х20 заполнить случайными чмслами от 0 до 15." +
                "\nВывести на экран саму матрицу и номер строк, в которых чмсло 5 встречается три и более раз.");
        int[][] arr = createMultiArray(10, 20, 0, 15);
        printMultiArray(arr);
        for (int j = 0; j < arr[0].length; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == 5) {
                    count++;
                    if (count >= 3) {
                        System.out.println("строка № " + j);
                    }
                }
            }
        }
    }
}
