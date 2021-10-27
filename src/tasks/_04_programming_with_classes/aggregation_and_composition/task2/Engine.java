package tasks._04_programming_with_classes.aggregation_and_composition.task2;

public class Engine {
    private String volume;

    public Engine(String volume) {
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume='" + volume + '\'' +
                '}';
    }
}
