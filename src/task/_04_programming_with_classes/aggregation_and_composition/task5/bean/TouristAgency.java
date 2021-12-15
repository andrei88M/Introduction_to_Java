package task._04_programming_with_classes.aggregation_and_composition.task5.bean;

import java.util.ArrayList;
import java.util.List;

public class TouristAgency {
    private List<TravelVoucher> travelVouchers;

    {
        travelVouchers = new ArrayList<>();
    }

    public void add(TravelVoucher travelVoucher) {
        travelVouchers.add(travelVoucher);
    }
}
