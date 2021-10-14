package tasks._02_algorithmization.decomposition;

import service.AbstractTask;
import service.Task;

public class Task1 extends AbstractTask implements Task {
    private int searchGCD(int a, int b) {
        int size = Math.min(Math.abs(a), Math.abs(b));
        for (int i = size; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    private int searchLCM(int a, int b, int gcd) {
        return a * b / gcd;
    }

    @Override
    public void solving() {
        System.out.println("Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        int gcd = searchGCD(a, b);
        int lcm = searchLCM(a, b, gcd);
        System.out.println("НОД " + gcd + " НОК " + lcm);
    }
}
