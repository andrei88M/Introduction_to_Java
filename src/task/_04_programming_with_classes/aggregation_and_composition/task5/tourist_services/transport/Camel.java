package task._04_programming_with_classes.aggregation_and_composition.task5.tourist_services.transport;

import task._04_programming_with_classes.aggregation_and_composition.task5.tourist_services.Transport;

public class Camel implements Transport {
    @Override
    public void transport() {
        System.out.println("ехать на верблюдах");
    }
}
