package service.one;

import tasks.Task;
import tasks._01_basics_of_software_code_development.branch.*;

public class Branch implements BasicOfSoftwareFactory {
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
        } else if (taskNumber == 5) {
            task = new Task5();
        } else {
            System.out.println("BRANCH_TASK 1-5");
            return;
        }
        task.solving();
    }
}
