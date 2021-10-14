package tasks._01_basics_of_software_code_development.cycles;

import service.AbstractTask;
import service.Task;

public class Task6 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера");
        for (int i = 32; i <= 126; i++) {
            System.out.println((char) i + " ->" + i);
        }
    }
}
