package task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.shoping;

import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.Shopping;

public class Souvenir implements Shopping {
    @Override
    public void shopping() {
        System.out.println("купить сувенир на память");
    }
}
