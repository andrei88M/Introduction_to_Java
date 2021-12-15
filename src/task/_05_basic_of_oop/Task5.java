package task._05_basic_of_oop;

import task.Task;
import task._05_basic_of_oop.task5.PresentFactory;
import task._05_basic_of_oop.task5.present.FlowerFactory;
import task._05_basic_of_oop.task5.present.Present;
import task._05_basic_of_oop.task5.present.SwapsFactory;


public class Task5 implements Task {
    @Override
    public void solving() {
        System.out.println("Создать консольное приложение, удовлетворяющее следующим требованиям:\n" +
                "-Корректно спроектируйте и реализуйте предметную область задачи.\n" +
                "-Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.\n" +
                "-Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.\n" +
                "-Для проверкикорректности переданных данных можно применить регулярные выражения.\n" +
                "-Меню выбора действий пользователем можно не реализовывать, используйте заглушку.\n" +
                "-Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().\n" +
                "  Вариант А. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции\n" +
                "(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются\n" +
                "цветы и упаковка.\n" +
                "  Вариант В. Подарки. Реализовать приложение, позволяющее создавать подарки(объект, представляющий собой\n" +
                "подарок). Составляющими целого подарка являются сладости и упаковки.");
        PresentFactory flowerComposition = new FlowerFactory();
        Present present = new Present(flowerComposition.getWrap());
        present.add(flowerComposition.getProduct());
        present.add(flowerComposition.getProduct());
        present.add(flowerComposition.getProduct());
        present.printAll();

        PresentFactory presentSweets = new SwapsFactory();
        Present present2 = new Present(presentSweets.getWrap());
        present2.add(presentSweets.getProduct());
        present2.add(presentSweets.getProduct());
        present2.add(presentSweets.getProduct());
        present2.add(presentSweets.getProduct());
        present2.add(presentSweets.getProduct());
        present2.printAll();
    }
}
