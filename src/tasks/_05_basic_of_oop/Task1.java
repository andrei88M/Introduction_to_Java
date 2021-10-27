package tasks._05_basic_of_oop;

import tasks.Task;
import tasks._05_basic_of_oop.task1.TextFile;

public class Task1 implements Task {
    @Override
    public void solving() {
        System.out.println("Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы:\n" +
                "создать, переименовать, вывести на консоль содержимое, дополнить, удалить.");
        TextFile textFile = new TextFile();
        textFile.create("dir");
        textFile.rename("der2");
        textFile.addText("text");
        System.out.println(textFile.getFile());
        textFile.delete();
    }
}
