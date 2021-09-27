package basics_of_software_code_development;

public class Branch {
    public static void main(String[] args) {
        Task1.solving(45, 411);
        Task2.solving(1, 2, 3, 4);
        Task3.solving(0, 0, 0, 1, 0, 6);
        Task4.solving(4, 8, 5, 6, 3);
        Task5.solving(0);
    }

    private class Task1 {
        //Даны 2 угла треугольника.Определить существует ли такой треугольник.
        static void solving(int angle1, int angle2) {
            if (angle1 + angle2 < 180) {
                if (angle1 == 90 || angle2 == 90 || angle1 + angle2 == 90) {
                    System.out.println("треугольник прямоугольный");
                    return;
                }
                System.out.println("треугольник существует");
            } else {
                System.out.println("треугольника не существует");
            }
        }
    }

    private class Task2 {
        //Найти max{ min{a,b}, min{c,d} }
        static void solving(int a, int b, int c, int d) {
            int min1, min2, max;
            if (a < b) {
                min1 = a;
            } else {
                min1 = b;
            }
            if (c < d) {
                min2 = c;
            } else {
                min2 = d;
            }
            if (min1 > min2) {
                max = min1;
            } else {
                max = min2;
            }
            System.out.println(max);

        }
    }

    private class Task3 {
        //Даны 3 точки. Определить будут ли они расположены на одной прямой.
        static void solving(int x1, int y1, int x2, int y2, int x3, int y3) {
            int ax = Math.abs(x2 - x1);
            int ay = Math.abs(y2 - y1);
            int bx = Math.abs(x3 - x1);
            int by = Math.abs(y3 - y1);
            if (ax / ay == bx / by) {
                System.out.println("точки на одной прямой");
            } else {
                System.out.println("точки не на одной прямой");
            }
        }
    }

    private class Task4 {
        //A,B - размеры отверстия. x, y, z - размеры кирпича
        static void solving(int a, int b, int x, int y, int z) {
            if ((a > x && b > y)
                    || (a > y && b > x)
                    || (a > x && b > z)
                    || (a > z && b > x)
                    || (a > y && b > z)
                    || (a > z && b > y)) {
                System.out.println("кирпич пролезет");
            } else {
                System.out.println("кирпич не пролезет");
            }
        }
    }

    private class Task5 {
        static void solving(int x) {
            double result;
            if (x <= 3) {
                result = x * x - 3 * x + 9;
            } else {
                result = 1 / (Math.pow(x, 3) + 6);
            }
            System.out.println(result);
        }
    }
}
