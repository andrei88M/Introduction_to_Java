package tasks._02_algorithmization.decomposition;

import service.AbstractTask;
import service.Task;

public class Task4 extends AbstractTask implements Task {
    private double getDistance(int[] pointA, int[] pointB) {
        int x = pointA[0] - pointB[0];
        int y = pointA[1] - pointB[1];
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public void solving() {
        System.out.println("На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие," +
                "\nмежду какими из пар точек самое большое растояние.Указание.Координаты точек занести в массив.");
        System.out.print("Количество точек n = ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 1; i <= n; i++) {
            System.out.println("введите координаты точки №" + i);
            System.out.print("x = ");
            arr[i - 1][0] = scanner.nextInt();
            System.out.print("y = ");
            arr[i - 1][1] = scanner.nextInt();
        }
        searchForPoints(arr);
    }

    private void searchForPoints(int[][] arr) {
        double distance = 0;
        int point1 = -1;
        int point2 = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double distance2 = getDistance(arr[i], arr[j]);
                if (distance2 > distance) {
                    distance = distance2;
                    point1 = i;
                    point2 = j;
                }
            }
        }
        System.out.println("Самое большое растояние " + distance +
                " \nмежду точками (" + arr[point1][0] + ", " + arr[point1][1] + ") (" + arr[point2][0] + ", " + arr[point2][1] + ")");
    }
}
