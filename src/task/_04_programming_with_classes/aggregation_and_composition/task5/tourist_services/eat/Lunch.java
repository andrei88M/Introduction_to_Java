package task._04_programming_with_classes.aggregation_and_composition.task5.tourist_services.eat;

import task._04_programming_with_classes.aggregation_and_composition.task5.tourist_services.Eat;

public class Lunch implements Eat {
    @Override
    public void eat() {
        System.out.println("lunch");
    }
}
