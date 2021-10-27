package tasks._04_programming_with_classes.simplest_classes_and_objects.task4;


public class RailwayStation {
    private int index = 0;
    private Train[] trains;

    public RailwayStation(int size) {
        trains = new Train[size];
    }

    public void add(Train train) {
        if (index >= trains.length) return;
        trains[index] = train;
        index++;
    }

    public void sort() {
        for (int i = 0; i < trains.length; i++) {
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[i].getNumberTrain() > trains[j].getNumberTrain()) {
                    Train train = trains[i];
                    trains[i] = trains[j];
                    trains[j] = train;
                }
            }
        }
    }

    public void printNumberTrain(int numberTrain) {
        for (Train train : trains) {
            if (train.getNumberTrain() == numberTrain) {
                System.out.println(train);
                return;
            }
        }
    }

    public void printAll() {
        for (Train train : trains) {
            System.out.println(train);
        }
    }

    public void sort2() {
        for (int i = 0; i < trains.length; i++) {
            String sI = trains[i].getDestination();
            for (int j = i + 1; j < trains.length; j++) {
                String sJ = trains[j].getDestination();
                if (sI.compareToIgnoreCase(sJ) > 0) {
                    Train train = trains[i];
                    trains[i] = trains[j];
                    trains[j] = train;
                    sI = trains[i].getDestination();
                } else if (sI.compareToIgnoreCase(sJ) == 0) {
                    if (trains[i].getTime() > trains[j].getTime()) {
                        Train train = trains[i];
                        trains[i] = trains[j];
                        trains[j] = train;
                        sI = trains[i].getDestination();
                    }
                }
            }
        }
    }

}
