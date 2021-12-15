package task._03_string_and_basic_of_text_processing.working_with_a_string_as_with_an_array_of_characters;

import task.AbstractTask;
import task.Task;

public class Task4 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("в строке найти количество чисел ");
        System.out.print("введите строку ");
        String str = enterString();
        str = str + " ";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (getBoolean(str, i) && !getBoolean(str, i + 1)) {
                count++;
            }
        }
        System.out.println("количество чисел в строке " + count);
    }

}
