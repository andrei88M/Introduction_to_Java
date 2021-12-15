package task._02_algorithmization.decomposition;

import task.AbstractTask;
import task.Task;

public class Task9 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны числа X,Y,Z,T - длины сторон четырехугольника. Написать мнтод(методы)\n" +
                "вычисления его площади, если угол между сторонами длиной X и Y - прямой.");
        System.out.print("x = ");
        int x = enterInt();
        System.out.print("y = ");
        int y = enterInt();
        System.out.print("z = ");
        int z = enterInt();
        System.out.print("t = ");
        int t = enterInt();
        System.out.println();

        System.out.println(getS(x, y, z, t));
    }

    private double getS(int x, int y, int z, int t) {
        double s1 = x * y / 2d;
        double l = Math.sqrt(x * x + y * y);
        double p = (z + t + l) / 2;
        double s2 = Math.sqrt(p * (p - z) * (p - t) * (p - l));
        double s = s2 + s1;
        return s;
    }
}
