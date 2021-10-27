package tasks._04_programming_with_classes.simplest_classes_and_objects;

import tasks.Task;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task4.RailwayStation;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task4.Train;

public class Task4 implements Task {
    @Override
    public void solving() {
        System.out.println("Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.\n" +
                " Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов\n" +
                " массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен\n" +
                " пользователем. добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами\n" +
                " назначения должны быть упорядочены по времени отправления.");
        RailwayStation railwayStation = new RailwayStation(5);
        railwayStation.add(getRandomTrain());
        railwayStation.add(getRandomTrain());
        railwayStation.add(getRandomTrain());
        railwayStation.add(getRandomTrain());
        railwayStation.add(getRandomTrain());

        railwayStation.sort();
        railwayStation.printAll();
        System.out.println();

        railwayStation.printNumberTrain(42);
        System.out.println();

        railwayStation.sort2();
        railwayStation.printAll();
    }

    private Train getRandomTrain() {
        Train train = new Train();
        train.setNumberTrain((int) (Math.random() * 9 + 1));
        train.setTime((int) (Math.random() * 9 + 1));
        train.setDestination("Minsk" + (int) (Math.random() * 9 + 1));
        return train;
    }
}
