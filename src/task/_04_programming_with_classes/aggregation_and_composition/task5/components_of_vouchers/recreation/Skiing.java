package task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.recreation;

import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.Recreation;

public class Skiing implements Recreation {
    @Override
    public void toInform() {
        System.out.println("кататься на горных лыжах");
    }
}
