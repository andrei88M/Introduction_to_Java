package task._04_programming_with_classes.aggregation_and_composition;

import task.Task;
import task._04_programming_with_classes.aggregation_and_composition.task2.Car;
import task._04_programming_with_classes.aggregation_and_composition.task2.Engine;
import task._04_programming_with_classes.aggregation_and_composition.task2.Wheel;

public class Task2 implements Task {
    @Override
    public void solving() {
        System.out.println("Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы:\n" +
                "ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.");

        Engine engine = new Engine("2.0tdi");
        Wheel wheel = new Wheel("minsk", 4);
        Car car = new Car(wheel, engine, "super car");
        car.drive();
        car.printModel();
        car.changeWheel();
        car.fought();
    }
}
