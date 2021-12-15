package task._05_basic_of_oop;

import task.Task;
import task._05_basic_of_oop.task3.Calendar;

public class Task3 implements Task {
    @Override
    public void solving() {
        System.out.println("Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить\n" +
                "информацию о выходных и праздничных днях.");
        Calendar calendar = new Calendar();
        calendar.setInformationAboutHolidays("birthday",10,1);
        calendar.printCalendar();
    }
}
