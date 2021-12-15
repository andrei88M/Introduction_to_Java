package task._05_basic_of_oop.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Product> products;

    public Payment() {
        products = new ArrayList<>();
    }
    public void add(String productName,int price){
        Product product = new Product(productName,price);
        products.add(product);
    }
    public void pay(){
        int sum = 0;
        for (Product product : products) {
            System.out.println(product.getName() + "  " + product.getPrice());
            sum += product.getPrice();
        }
        System.out.println(sum);
    }

    private class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
