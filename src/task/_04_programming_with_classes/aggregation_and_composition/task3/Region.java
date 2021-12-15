package task._04_programming_with_classes.aggregation_and_composition.task3;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String region;
    private City regionalCenter;
    private List<District> list = new ArrayList<>();

    public Region(String region, City regionalCenter) {
        this.region = region;
        this.regionalCenter = regionalCenter;
    }

    public void printRegionalCenter(){
        System.out.println(regionalCenter.getCity());
    }

    public void add(District district){
        list.add(district);
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    @Override
    public String toString() {
        return "Region{" +
                "region='" + region + '\'' +
                '}';
    }
}
