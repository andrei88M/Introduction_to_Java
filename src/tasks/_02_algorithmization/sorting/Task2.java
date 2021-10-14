package tasks._02_algorithmization.sorting;

import service.AbstractTask;
import service.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны две последовательности a1 <= a2 <= ... <= a^n и b1 <= b2 <= ... <= b^m" +
                "\nОбразовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.");
        int[] a = new int[10];
        int[] b = new int[8];
        for (int i = 0; i < a.length; i++) {
            int x = 0;
            if (i != 0) {
                x = a[i - 1];
            }
            a[i] = x + (int) (Math.random() * 3);
        }
        for (int i = 0; i < b.length; i++) {
            int y = 0;
            if (i != 0) {
                y = b[i - 1];
            }
            b[i] = y + (int) (Math.random() * 4);
        }
        printArray(a);
        System.out.println();
        printArray(b);
        System.out.println();

        int size = a.length + b.length;
        int n = 0;
        int m = 0;
        int numbA = a[0];
        int numbB = b[0];
        for (int i = 0; i < size; i++) {
            if (n < a.length && m < b.length) {
                if (numbA < numbB) {
                    System.out.print(numbA + " ");
                    n++;
                } else {
                    System.out.print(numbB + " ");
                    m++;
                }
            } else if (n >= a.length) {
                System.out.print(numbB +" ");
                m++;
            }else {
                System.out.print(numbA + " ");
                n++;
            }
            if (n < a.length) {
                numbA = a[n];
            }
            if (m < b.length) {
                numbB = b[m];
            }

        }
    }
}
