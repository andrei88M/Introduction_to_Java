package task._04_programming_with_classes.aggregation_and_composition.task3;

public class City {
    private String city;
    private String square;

    public City(String city) {
        this.city = city;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                '}';
    }
}
