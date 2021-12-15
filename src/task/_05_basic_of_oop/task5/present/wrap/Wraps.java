package task._05_basic_of_oop.task5.present.wrap;

import task._05_basic_of_oop.task5.Wrap;

public class Wraps implements Wrap {
    @Override
    public void printType() {
        System.out.println("упаковка");
    }

    @Override
    public String toString() {
        return "упаковка";
    }
}
