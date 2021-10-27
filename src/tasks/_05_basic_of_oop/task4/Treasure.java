package tasks._05_basic_of_oop.task4;

public class Treasure {
   private int price;
   private String name;

    public Treasure(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
