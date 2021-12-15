package task._04_programming_with_classes.aggregation_and_composition.task5.bean;

import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.Excursion;
import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.Recreation;
import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.Shopping;
import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.Treatment;

public class Voucher {
    private String name;
    private Excursion excursion;
    private Recreation recreation;
    private Shopping shopping;
    private Treatment treatment;

    public Voucher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public Recreation getRecreation() {
        return recreation;
    }

    public void setRecreation(Recreation recreation) {
        this.recreation = recreation;
    }

    public Shopping getShopping() {
        return shopping;
    }

    public void setShopping(Shopping shopping) {
        this.shopping = shopping;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
}
