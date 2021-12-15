package task._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object;

import task.AbstractTask;
import task.Task;

public class Task5 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Подсчитать, сколько раз среди символов заданной строки встречается буква 'a'");
        System.out.print("введите строку ");
        String str = enterString();

        char[] chars = str.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (aChar == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
