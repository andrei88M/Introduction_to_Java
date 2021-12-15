package task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.excursion;

import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.Excursion;

public class ArchitecturalAttraction implements Excursion {
    @Override
    public void excursion() {
        System.out.println("посмотреть колизец и пирамиду");
    }
}
