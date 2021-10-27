package tasks._01_basics_of_software_code_development.cycles;

import tasks.AbstractTask;
import tasks.Task;

public class Task8 extends AbstractTask implements Task {
    private static int[][] arr = new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}, {8, 0}, {9, 0}};

    @Override
    public void solving() {
        System.out.println("Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        System.out.print("первое число ");
        int a = scanner.nextInt();
        System.out.print("второе число ");
        int b = scanner.nextInt();

        int a2 = a;
        int b2 = b;
        int i = 10;
        do {
            int temp = a2 % 10;
            int j = 10;
            do {
                int temp2 = b2 % 10;
                b2 = b2 / 10;
                if (temp == temp2) {
                    save(temp);
                }
                j *= 10;
            } while (b % j != b);
            b2 = b;
            a2 = a2 / 10;
            i *= 10;
        } while (a % i != a);
        printNumber();
    }


    private static void save(int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i][0]) {
                arr[i][1] = 1;
                break;
            }
        }
    }

    private static void printNumber() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] == 1) {
                System.out.print(arr[i][0] + " ");
            }
        }
    }
}
