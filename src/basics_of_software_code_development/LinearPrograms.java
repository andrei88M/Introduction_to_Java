package basics_of_software_code_development;

import java.util.Scanner;

public class LinearPrograms {
    public static Scanner scanner;

    public static void main(String[] args) {
        Task1.solving(1.1, 2.2, 3.3);
        Task2.solving(1.1, 1, 3.3);
        Task3.solving(20, 88);
        Task4.solving(1, 3);
        Task5.solving(1);
        Task6.solving(-4, -3);
    }

    private class Task1 {
        //Найдите значение функции
        public static void solving(double a, double b, double c) {
            double z = ((a - 3) * b / 2) + c;
            System.out.println(z);
        }
    }

    private class Task2 {
        //Вычислить значение выражения
        public static void solving(double a, double b, double c) {
            double result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println(result);
        }
    }

    private class Task3 {
        public static void solving(double x, double y) {
            double radianX = Math.toRadians(x);
            double radianY = Math.toRadians(y);
            double result = (Math.sin(radianX) + Math.cos(radianY))
                    / (Math.cos(radianX) - Math.sin(radianY))
                    * Math.tan(radianX * radianY);
            System.out.println(result);
        }
    }

    private class Task4 {
        //Дано действительное число R вида nnn.ddd .Поменять местами дробную и целую часть местами.
        static void solving(int n, int d) {
            double r = 111 * n + 0.111 * d;
            System.out.println(r);
            int tempR = (int) (r * 1000);
            n = tempR / 100000;
            d = tempR % 10;
            System.out.println(d * 111 + n * 0.111);
        }
    }

    private class Task5 {
        private static int sec, min, hour;

        static void solving(int t) {
            if (t >= 60) {
                min = t / 60;
                sec = t % 60;
                if (min >= 60) {
                    hour = min / 60;
                    min = min % 60;
                }
            } else {
                sec = t;
            }
            System.out.println(hour + "ч " + min + "м " + sec + "c");
        }
    }

    private class Task6 {
        static void solving(int x, int y) {
            boolean aBoolean = (y > 0 && y <= 4) && (x >= -2 && x <= 2)
                    || (y <= 0 && y >= -3) && (x >= -4 && x <= 4);
            System.out.println(aBoolean);
        }
    }
}
