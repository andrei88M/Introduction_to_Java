package service.five;

import task.Task;
import task._05_basic_of_oop.*;

public class BasicOfOOP implements BasicOfOOPFactory{
    private Task task;
    @Override
    public void task(int taskNumber) {
        if (taskNumber == 1){
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
            System.out.println("basic_of_oop TASK_1-5");
            return;
        }
        task.solving();
    }
}
