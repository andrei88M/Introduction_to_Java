package task._04_programming_with_classes.simplest_classes_and_objects;

import task.Task;
import task._04_programming_with_classes.simplest_classes_and_objects.task7.Triangle;

public class Task7 implements Task {
    @Override
    public void solving() {
        System.out.println("Описать класс, представляющий треугольник. Предусмотреть методы для создания\n" +
                "объектов, вычисления площади, периметра и точки пересечения медиан.");
        Triangle triangle = new Triangle();
        triangle.setABC(5,8,7);
        System.out.println(triangle.p());
        System.out.println(triangle.s());
    }
}
