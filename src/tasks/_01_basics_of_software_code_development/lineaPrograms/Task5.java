package tasks._01_basics_of_software_code_development.lineaPrograms;

import tasks.AbstractTask;
import tasks.Task;

public class Task5 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дано натуральное число T, которое представляет длительность прошедшего времени в секундах." +
                "\nВывести данное значение длительности в часах, минутах и секундах в следующем формате: HHч MMмин SSc.");
        System.out.print("T = ");
        int t = scanner.nextInt();
        int min = 0;
        int sec = 0;
        int hour = 0;

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
