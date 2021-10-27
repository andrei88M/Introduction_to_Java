package tasks._04_programming_with_classes.simplest_classes_and_objects;

import tasks.Task;
import tasks.AbstractTask;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task3.Group;
import tasks._04_programming_with_classes.simplest_classes_and_objects.task3.Student;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Создайте класс с именем Student, содержащий поля:фамилия и инициалы, номер группы, успеваемость.\n" +
                "Создайте массив из десяти элементов такого типа. Добавьте возможномть вывода фамилий и номеров групп студентов,\n" +
                "имеющие оценки, равные только 9 или 10.");
        Group group = new Group(10);
        Student student = new Student("name3", "2B");
        Student student1 = new Student("name6", "1A");
        student.setPerformance(new int[]{9, 10, 9, 10, 10});
        student1.setPerformance(new int[]{3, 9, 5, 6, 3});
        group.add(new Student("name", "1A"));
        group.add(new Student("name2", "4C"));
        group.add(student);
        group.add(student1);
        group.printStudent9and10();

    }
}
