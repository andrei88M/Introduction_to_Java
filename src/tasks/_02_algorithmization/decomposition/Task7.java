package tasks._02_algorithmization.decomposition;

import service.Task;

import java.math.BigInteger;

public class Task7 implements Task {
    @Override
    public void solving() {
        System.out.println("Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.");
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i = 1; i <=9 ; i++) {
            bigInteger = bigInteger.add(getFactorial(i));
        }
        System.out.println(bigInteger);
    }

    private BigInteger getFactorial(int number) {
        BigInteger bigInteger = BigInteger.ONE;
        for (int i = 1; i <= number ; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
}
