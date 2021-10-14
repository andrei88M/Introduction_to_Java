package tasks._01_basics_of_software_code_development.cycles;

import service.AbstractTask;
import service.Task;

import java.math.BigInteger;

public class Task4 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Cоставить прграмму нахождения произведения квадратов первых двухсот чисел.");
        BigInteger bigInteger = BigInteger.ONE;
        for (int i = 1; i <= 200; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(bigInteger);
    }
}
