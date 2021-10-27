package service.foir;

import tasks.Task;
import tasks._04_programming_with_classes.aggregation_and_composition.*;

public class AggregationAndComposition implements ProgrammingWithClassesFactory{
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
            System.out.println("aggregation_and_composition TASK 1-5");
            return;
        }
        task.solving();
    }
}
