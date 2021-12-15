package task._04_programming_with_classes.aggregation_and_composition;

import task.Task;
import task._04_programming_with_classes.aggregation_and_composition.task5.bean.AgencyService;
import task._04_programming_with_classes.aggregation_and_composition.task5.bean.TouristAgency;
import task._04_programming_with_classes.aggregation_and_composition.task5.bean.TravelVoucher;
import task._04_programming_with_classes.aggregation_and_composition.task5.bean.Voucher;
import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.excursion.Museum;
import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.recreation.Skiing;
import task._04_programming_with_classes.aggregation_and_composition.task5.components_of_vouchers.treatment.MineralAir;
import task._04_programming_with_classes.aggregation_and_composition.task5.tourist_services.eat.Lunch;
import task._04_programming_with_classes.aggregation_and_composition.task5.tourist_services.transport.Camel;

public class Task5 implements Task {
    @Override
    public void solving() {
        System.out.println("Туристические путевки. Сформировать набор предложений клиенту по выбору туристической\n" +
                "путевки различного типа(отдых, экскурсии, лечение, шопинг, круиз и т.д) для оптимального выбора.\n" +
                "Учитывать возможность выбора транспорта, питания и числа дней, Реализовать выбор и сортировку путевок.\n");
        Voucher voucher = new Voucher("name");

        voucher.setExcursion(new Museum());
        voucher.setRecreation(new Skiing());
        voucher.setTreatment(new MineralAir());

        AgencyService agencyService = new AgencyService(new Lunch(), new Camel());

        TravelVoucher travelVoucher = new TravelVoucher(100,voucher,agencyService);

        TouristAgency touristAgency = new TouristAgency();
        touristAgency.add(travelVoucher);
    }
}
