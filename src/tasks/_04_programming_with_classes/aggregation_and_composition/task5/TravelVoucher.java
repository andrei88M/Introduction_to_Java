package tasks._04_programming_with_classes.aggregation_and_composition.task5;

public class TravelVoucher {
    private String name;
    private String type;
    private String transport;
    private String eat;
    private int quantityDay;

    public TravelVoucher(String name, String type, String transport, String eat, int quantityDay) {
        this.name = name;
        this.type = type;
        this.transport = transport;
        this.eat = eat;
        this.quantityDay = quantityDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public int getQuantityDay() {
        return quantityDay;
    }

    public void setQuantityDay(int quantityDay) {
        this.quantityDay = quantityDay;
    }

    @Override
    public String toString() {
        return "TravelVoucher{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", eat='" + eat + '\'' +
                ", quantityDay=" + quantityDay +
                '}';
    }
}
