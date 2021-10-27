package tasks._01_basics_of_software_code_development.cycles;

import tasks.AbstractTask;
import tasks.Task;

public class Task5 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или" +
                "\nравен заданному е. Общий член ряда имеет вид");
        System.out.print("e = ");
        double e = scanner.nextDouble();

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
