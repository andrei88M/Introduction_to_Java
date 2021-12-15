package service.three;

import task.Task;
import task._03_string_and_basic_of_text_processing.work_with_regular_expressions.*;

public class RegularExpressions implements StringAndBasicOfTextProcessingFactory {
    private Task task;

    @Override
    public void task(int taskNumber) {
        if (taskNumber == 1) {
            task = new Task1();
        } else if (taskNumber == 2) {
            task = new Task2();
        } else {
            System.out.println("regular_expressions TASK 1-2");
            return;
        }
        task.solving();
    }
}
