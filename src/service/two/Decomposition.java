package service.two;

import service.Task;
import tasks._02_algorithmization.decomposition.*;

public class Decomposition implements AlgorithmizationFactory {
    private Task task;

    @Override
    public void solving(int taskNumber) {
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
        } else if (taskNumber == 10) {
            task = new Task10();
        } else if (taskNumber == 11) {
            task = new Task11();
        } else if (taskNumber == 12) {
            task = new Task12();
        } else if (taskNumber == 13) {
            task = new Task13();
        } else if (taskNumber == 14) {
            task = new Task14();
        } else if (taskNumber == 15) {
            task = new Task15();
        } else if (taskNumber == 16) {
            task = new Task16();
        } else if (taskNumber == 17) {
            task = new Task17();
        } else {
            System.out.println("DECOMPOSITION_TASK 1-17");
            return;
        }
        task.solving();
    }
}
