package task._05_basic_of_oop.task5.present;

import task._05_basic_of_oop.task5.PresentFactory;
import task._05_basic_of_oop.task5.Product;
import task._05_basic_of_oop.task5.Wrap;
import task._05_basic_of_oop.task5.present.sweets.Sweets;
import task._05_basic_of_oop.task5.present.wrap.Wraps;

public class SwapsFactory implements PresentFactory {
    @Override
    public Product getProduct() {
        return new Sweets();
    }

    @Override
    public Wrap getWrap() {
        return new Wraps();
    }
}
