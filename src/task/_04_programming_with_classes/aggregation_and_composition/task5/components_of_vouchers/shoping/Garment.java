package task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.shoping;

import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.Treatment;

public class Garment implements Treatment {

    @Override
    public void treatment() {
        System.out.println("купить одежду");
    }
}
