package tasks._05_basic_of_oop.task5.present;

import tasks._05_basic_of_oop.task5.Product;
import tasks._05_basic_of_oop.task5.Wrap;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private Wrap wrap;
    private List<Product> productList;

    public Present(Wrap wrap) {
        this.wrap = wrap;
        productList = new ArrayList<>();
    }

    public void add(Product product){
        productList.add(product);
    }

    public void printAll(){
        for (Product product : productList) {
            product.printInfo();
        }
        System.out.println(wrap);
    }

}
