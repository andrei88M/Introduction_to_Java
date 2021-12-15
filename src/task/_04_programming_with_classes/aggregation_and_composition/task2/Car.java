package task._04_programming_with_classes.aggregation_and_composition.task2;

public class Car {
    private Wheel wheel;
    private Engine engine;
    private String model;

    public Car(Wheel wheel, Engine engine,String model) {
        this.wheel = wheel;
        this.engine = engine;
        this.model = model;
    }

    public void drive(){
        System.out.println("drive");
    }
    public void fought(){
        System.out.println("fought");
    }
    public void changeWheel(){
        System.out.println("change the wheel");
    }
    public void printModel(){
        System.out.println(model);
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
