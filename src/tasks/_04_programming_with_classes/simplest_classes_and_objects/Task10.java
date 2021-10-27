package tasks._04_programming_with_classes.simplest_classes_and_objects;

import tasks.Task;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task10.Airline;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task10.ArrayAirline;

public class Task10 implements Task {
    @Override
    public void solving() {
        System.out.println("Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,\n" +
                "set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline,\n" +
                "с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.\n" +
                " Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.\n" +
                "Найти и вывести:\n" +
                "а)список рейсов для заданного пункта назначения;\n" +
                "b)список рейсов для заданного дня недели;\n" +
                "c)список рейсов для заданного дня недели, время вылета для которых юольше заданного\n");
        ArrayAirline arrayAirline = new ArrayAirline(5);
        arrayAirline.add(getRandomAirline());
        arrayAirline.add(getRandomAirline());
        arrayAirline.add(getRandomAirline());
        arrayAirline.add(getRandomAirline());
        arrayAirline.add(getRandomAirline());
        arrayAirline.printAll();
        System.out.println();

        arrayAirline.searchDestination("destination1");
        System.out.println();
        arrayAirline.searchDay("day1");
        System.out.println();
        arrayAirline.searchDayAndMoreThanTime("day1", 1);
    }

    private Airline getRandomAirline() {
        Airline airline = new Airline();
        airline.setAircraftType("type" + (int) (Math.random() * 9 + 1));
        airline.setDayOfTheWeek("day" + (int) (Math.random() * 7 + 1));
        airline.setDepartureTime((int) (Math.random() * 9 + 1));
        airline.setDestination("destination" + (int) (Math.random() * 9 + 1));
        airline.setFlightNumber((int) (Math.random() * 9 + 1));
        return airline;
    }
}
