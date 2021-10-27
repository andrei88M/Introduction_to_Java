package tasks._05_basic_of_oop.task5.present.flower;

import tasks._05_basic_of_oop.task5.Product;

public class Flower implements Product {
    @Override
    public void printInfo() {
        System.out.println("цветок");
    }
}
