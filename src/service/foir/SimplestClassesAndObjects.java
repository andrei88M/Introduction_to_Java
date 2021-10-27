package service.foir;

import tasks.Task;
import tasks._04_programming_with_classes.simplest_classes_and_objects.*;

public class SimplestClassesAndObjects implements ProgrammingWithClassesFactory {
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
        } else if (taskNumber == 6) {
            task = new Task6();
        } else if (taskNumber == 7) {
            task = new Task7();
        } else if (taskNumber == 8) {
            task = new Task8();
        } else if (taskNumber == 9) {
            task = new Task9();
        }else if (taskNumber == 10){
            task = new Task10();
        }else {
            System.out.println("simplest_classes_and_objects TASK 1-10");
            return;
        }
        task.solving();
    }
}
