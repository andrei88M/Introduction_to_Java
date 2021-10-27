package tasks._02_algorithmization.decomposition;

import tasks.AbstractTask;
import tasks.Task;

public class Task2 extends AbstractTask implements Task {
    private int searchGCD(int a, int b, int c, int d) {
        int ab = Math.min(Math.abs(a), Math.abs(b));
        int cd = Math.min(Math.abs(c), Math.abs(d));
        int size = Math.min(ab, cd);
        for (int i = size; i >= 1; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                return i;
            }
        }
        return 1;
    }

    @Override
    public void solving() {
        System.out.println("Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        System.out.print("d = ");
        int d = scanner.nextInt();

        int gcd = searchGCD(a,b,c,d);
        System.out.println("наибольший общий делитель " + gcd);
    }
}
