package tasks._04_programming_with_classes.simplest_classes_and_objects.task4;

public class Train {
    /*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
    * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
    * массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
    * пользователем. добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
    * назначения должны быть упорядочены по времени отправления.*/
    private String destination;
    private int numberTrain;
    private int time;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberTrain=" + numberTrain +
                ", time=" + time +
                '}';
    }
}
