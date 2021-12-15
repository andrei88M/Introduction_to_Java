package task._04_programming_with_classes.aggregation_and_composition;

import task.Task;
import task._04_programming_with_classes.aggregation_and_composition.task3.*;


public class Task3 implements Task {
    @Override
    public void solving() {
        System.out.println("Создать объект класса Государство, используя классы Область, Район, Город. Методы:\n" +
                "вывести на консоль столицу, количество областей, площадь, областные центры.\n");
        City city = new City("Minsk");
        city.setSquare("RED");
        District district = new District("district");
        Region region = new Region("region", city);
        State state = new State("RB", city);

        district.add(city);
        region.add(district);
        state.add(region);

        state.printCapital();
        state.printQuantityRegion();
        state.printSquare();
        state.printAllRegionalCenter();
    }
}
