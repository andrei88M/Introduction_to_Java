package tasks._02_algorithmization.sorting;

import tasks.AbstractTask;
import tasks.Task;

public class Task7 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<=bm" +
                "\nТребуется указать те места, на которые нужно вставить элементы последовательности b1<=b2<=...<=bm" +
                "\nв первую последовательность так, чтобы новая последоватеьность оставалась возрастающей.");
        int[] a = new int[]{1, 1, 3, 5, 7, 8, 8, 11};
        int[] b = new int[]{0, 1, 3, 4, 5, 7, 9, 10, 12};

        int i = 0;
        for (int j = 0; j < b.length; j++) {
            if (i >= a.length) {
                System.out.println("все остальные элементы b ставяться после a["+(i-1)+"]");
            } else if (b[j] <= a[i]) {
                System.out.println("b[" + j + "] " + b[j] + " перед a[" + i + "] " + a[i]);
            } else if (b[j] > a[i]) {
                i++;
                j--;
            }
        }

    }
}
