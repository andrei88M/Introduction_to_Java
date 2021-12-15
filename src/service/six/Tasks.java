package service.six;


import task.Task;
import task._06_task.*;

public class Tasks implements TasksFactory {
    private Task task;

    @Override
    public void task(int taskNumber) {
        if (taskNumber == 1) {
            task = new Task1();
        } else if (taskNumber == 2) {
            task = new Task2();
        } else if (taskNumber == 3) {
            task = new Task3();
        } else if (taskNumber == 4) {
            task = new Task4();
        } else {
            System.out.println("06_tasks 1-4");
            return;
        }
        task.solving();
    }
}
