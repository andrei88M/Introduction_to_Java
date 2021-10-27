package tasks._04_programming_with_classes.aggregation_and_composition.task3;

import java.util.ArrayList;
import java.util.List;

public class District {
    private String district;
    private List<City> list = new ArrayList<>();

    public District(String district) {
        this.district = district;
    }

    public void add(City city){
        list.add(city);
    }

    @Override
    public String toString() {
        return "District{" +
                "district='" + district + '\'' +
                '}';
    }
}
