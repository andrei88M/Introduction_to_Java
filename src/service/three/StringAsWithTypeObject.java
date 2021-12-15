package service.three;

import task.Task;
import task._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object.*;

public class StringAsWithTypeObject implements StringAndBasicOfTextProcessingFactory {

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
        } else if (taskNumber == 10) {
            task = new Task10();
        } else {
            System.out.println("working_with_a_string_as_with_a_type_object TASK 1-10");
            return;
        }
        task.solving();
    }
}