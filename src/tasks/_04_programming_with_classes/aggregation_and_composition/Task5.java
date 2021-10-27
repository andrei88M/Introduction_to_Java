package tasks._04_programming_with_classes.aggregation_and_composition;

import tasks.Task;
import tasks._04_programming_with_classes.aggregation_and_composition.task5.TouristAgency;
import tasks._04_programming_with_classes.aggregation_and_composition.task5.TravelVoucher;

public class Task5 implements Task {
    @Override
    public void solving() {
        System.out.println("Туристические путевки. Сформировать набор предложений клиенту по выбору туристической\n" +
                "путевки различного типа(отдых, экскурсии, лечение, шопинг, круиз и т.д) для оптимального выбора.\n" +
                "Учитывать возможность выбора транспорта, питания и числа дней, Реализовать выбор и сортировку путевок.\n");
        TouristAgency touristAgency = new TouristAgency();
        TravelVoucher travelVoucher = new TravelVoucher("tourst","typ1","transport","eat",7);
        touristAgency.addTravelVoucher(travelVoucher);
    }
}
