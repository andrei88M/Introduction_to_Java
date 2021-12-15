package task._04_programming_with_classes.simplest_classes_and_objects.task10;

public class ArrayAirline {
    private int index = 0;
    private Airline[] airlines;

    public ArrayAirline(int size) {
        airlines = new Airline[size];
    }

    public void add(Airline airline) {
        airlines[index] = airline;
        index++;
    }

    public void printAll() {
        for (Airline airline : airlines) {
            System.out.println(airline);
        }
    }

    public void searchDestination(String destination) {
        for (Airline airline : airlines) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(airline);
            }
        }
    }

    public void searchDay(String day) {
        for (Airline airline : airlines) {
            if (airline.getDayOfTheWeek().equalsIgnoreCase(day)) {
                System.out.println(airline);
            }
        }
    }

    public void searchDayAndMoreThanTime(String day, int time) {
        for (Airline airline : airlines) {
            if (airline.getDayOfTheWeek().equalsIgnoreCase(day) && airline.getDepartureTime()>time){
                System.out.println(airline);
            }
        }
    }
}
