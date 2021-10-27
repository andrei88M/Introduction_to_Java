package tasks._04_programming_with_classes.aggregation_and_composition.task2;

public class Wheel {
    private String model;
    private int quantity;

    public Wheel(String model, int quantity) {
        this.model = model;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "model='" + model + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
