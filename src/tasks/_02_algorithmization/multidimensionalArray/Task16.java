package tasks._02_algorithmization.multidimensionalArray;

import service.AbstractTask;
import service.Task;

public class Task16 extends AbstractTask implements Task {

    @Override
    public void solving() {
        System.out.println("Магическим квадратом порядка n называется квадратная матрица размера nхn, " +
                "\nсоставленная из чисел 1, 2, 3, ..., n так, что суммы по каждому столбцу," +
                "\nкаждой строке и каждой из двух больших диагоналей равны между собой." +
                "\nПостроить такой квадрат. Пример магического квадрата порядка 3:" +
                "\n6 1 8" +
                "\n7 5 3" +
                "\n2 9 4");
        System.out.println("array[n][n]");
        int n = 3;
        int[] number = new int[n * n];
        while (true) {
            for (int i = 0; i < number.length; i++) {
                boolean bool = true;
                int numbI = getRandomNumb(number.length);
                for (int j = 0; j < i; j++) {
                    if (number[j] == numbI) {
                        i--;
                        bool = false;
                        break;
                    }
                }
                if (bool) {
                    number[i] = numbI;
                }
            }
            int[][] multiArray = initMultiArray(number, n);
            if (check(multiArray)) {
                printMultiArray(multiArray);
                break;
            }
        }

    }

    private boolean check(int arr[][]) {
        int sum = 0;
        for (int[] ints : arr) {
            sum += ints[0];
        }

        for (int[] ints : arr) {
            int sum2 = 0;
            for (int anInt : ints) {
                sum2 += anInt;
            }
            if (sum != sum2) {
                return false;
            }
        }

        int j = 0;
        int i = 0;
        while (j < arr.length) {
            int sum2 = 0;
            for (i = 0; i < arr.length; i++) {
                sum2 += arr[i][j];
            }
            if (sum != sum2) {
                return false;
            }
            j++;
        }

        int sum2 = 0;
        int sum3 = 0;
        for (i = 0; i < arr.length; i++) {
            sum2 += arr[i][i];
            sum3 += arr[arr.length - 1 - i][i];
        }
        return sum == sum2 && sum == sum3;
    }

    private int[][] initMultiArray(int[] arr, int n) {
        int[][] multiArray = new int[n][n];
        int k = 0;
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = arr[k];
                k++;
            }
        }
        return multiArray;
    }

    private int getRandomNumb(int n) {
        return (int) (Math.random() * n + 1);
    }
}
