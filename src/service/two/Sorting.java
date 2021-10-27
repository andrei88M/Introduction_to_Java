package service.two;

import tasks.Task;
import tasks._02_algorithmization.sorting.*;

public class Sorting implements AlgorithmizationFactory {
    @Override
    public void task(int taskNumber) {
        Task task;
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
        } else if (taskNumber == 6) {
            task = new Task6();
        } else if (taskNumber == 7) {
            task = new Task7();
        } else if (taskNumber == 8) {
            task = new Task8();
        } else {
            System.out.println("SORTING_TASK 1-8");
            return;
        }
        task.solving();
    }
}
