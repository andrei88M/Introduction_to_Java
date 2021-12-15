package task._04_programming_with_classes.aggregation_and_composition.task3;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String state;
    private City capital;
    private List<Region> list = new ArrayList<>();

    public State(String state, City capital) {
        this.state = state;
        this.capital = capital;
    }

    public void printSquare() {
        if (capital.getSquare() != null) {
            System.out.println(capital.getSquare());
        } else {
            System.out.println("no square");
        }
    }

    public void printAllRegionalCenter() {
        for (Region region : list) {
            System.out.println(region.getRegionalCenter());
        }
        ;
    }

    public void printCapital() {
        System.out.println(capital);
    }

    public void printQuantityRegion() {
        System.out.println(list.size());
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void add(Region region) {
        list.add(region);
    }

    @Override
    public String toString() {
        return "State{" +
                "state='" + state + '\'' +
                ", capital=" + capital +
                '}';
    }
}
