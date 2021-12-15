package task._03_string_and_basic_of_text_processing.working_with_a_string_as_with_an_array_of_characters;

import task.AbstractTask;
import task.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Заменить в строке все вхождения 'world' на 'letter'");
        System.out.print("введите строку ");
        String str = enterString();
        str = str.replaceAll("world","letter");
        System.out.println(str);
    }

}
