package service.three;

import tasks.Task;
import tasks._03_string_and_basic_of_text_processing.working_with_a_string_as_with_an_array_of_characters.*;

public class StringArrayOfCharacters implements StringAndBasicOfTextProcessingFactory {
    private Task task;

    @Override
    public void task(int taskNumber) {
        if (taskNumber == 1) {
            task = new Task1();
        }else if (taskNumber == 2){
            task = new Task2();
        }else if (taskNumber == 3){
            task = new Task3();
        }else if (taskNumber == 4){
            task = new Task4();
        }else if (taskNumber == 5){
            task = new Task5();
        }else {
            System.out.println("working_with_a_string_as_with_an_array_of_characters TASK 1-5");
            return;
        }
        task.solving();
    }
}
