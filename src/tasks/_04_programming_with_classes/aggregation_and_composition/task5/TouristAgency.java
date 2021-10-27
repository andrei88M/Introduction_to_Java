package tasks._04_programming_with_classes.aggregation_and_composition.task5;

import java.util.Comparator;
import java.util.List;

public class TouristAgency {
    private List<TravelVoucher> travelVouchers;

    public void addTravelVoucher(TravelVoucher travelVoucher) {
        travelVouchers.add(travelVoucher);
    }

    public void printVoucherType(String type) {
        for (TravelVoucher voucher : travelVouchers) {
            if (voucher.getType().equalsIgnoreCase(type)) {
                System.out.println(voucher);
            }
        }
    }

    public void sort(String str) {
        travelVouchers.sort((o1, o2) -> {
            int compareTo = 0;
            if (str.equalsIgnoreCase("name")) {
                compareTo = o1.getName().compareToIgnoreCase(o2.getName());
            } else if (str.equalsIgnoreCase("type")) {
                compareTo = o1.getType().compareToIgnoreCase(o2.getType());
            } else if (str.equalsIgnoreCase("day")) {
                compareTo = o1.getQuantityDay() - o2.getQuantityDay();
            }
            return compareTo;
        });
    }

}
