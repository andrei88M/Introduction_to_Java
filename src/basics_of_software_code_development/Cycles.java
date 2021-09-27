package basics_of_software_code_development;

import java.math.BigInteger;
import java.util.Scanner;

public class Cycles {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Task1.solving();
        Task2.solving(1, 10, 2);
        Task3.solving();
        Task4.solving();
        Task5.solving(0.0011);
        Task6.solving();
        Task7.solving(5, 15);
        Task8.solving(132253750, 76674423);
    }

    private class Task1 {
        static void solving() {
            int number;
            int result = 0;
            do {
                System.out.println("введите целое положительное число");
                number = scanner.nextInt();
            } while (number <= 0);

            for (int i = 1; i <= number; i++) {
                result += i;
            }
            System.out.println(result);
        }
    }

    private class Task2 {
        //Вычислить значение функции [a,b] с шагом h
        static void solving(int a, int b, int h) {
            int y;
            for (int x = a; x <= b; x += h) {
                y = x > 2 ? x : -1 * x;
                System.out.println("y= " + y);
            }
        }
    }

    private class Task3 {
        //Найти сумму двадратов первых ста чисел
        static void solving() {
            int result = 0;
            for (int i = 1; i <= 100; i++) {
                result += i * i;
            }
            System.out.println(result);
        }
    }

    private class Task4 {
        //Найти произведение квадратов первых двухсот чисел
        static void solving() {
            BigInteger bigInteger = BigInteger.ONE;
            for (int i = 1; i <= 200; i++) {
                bigInteger = bigInteger.multiply(BigInteger.valueOf(i * i));
            }
            System.out.println(bigInteger);
        }
    }


    private class Task5 {
        static void solving(double e) {
            double sum = 0;
            for (int i = 1; ; i++) {
                double number = 1 / (Math.pow(1 + i, i)) + 1 / (Math.pow(2 + i, i));
                if (Math.abs(number) > e) {
                    sum += number;
                    continue;
                }
                break;
            }
            System.out.println(sum);
        }
    }

    private class Task6 {
        static void solving() {
            for (int i = 32; i <= 126; i++) {
                System.out.println((char) i + " ->" + i);
            }
        }
    }

    private class Task7 {
        static void solving(int m, int n) {
            for (int i = m; i <= n; i++) {
                System.out.print("число " + i + " его делители ");
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.print(" " + j);
                    }
                }
                System.out.println();
            }
        }
    }

    private class Task8 {
        private static int[][] arr = new int[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}, {8, 0}, {9, 0}};

        static void solving(int a, int b) {
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
}
