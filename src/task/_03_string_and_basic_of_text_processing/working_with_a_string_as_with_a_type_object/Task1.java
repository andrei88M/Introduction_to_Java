package task._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object;

import task.AbstractTask;
import task.Task;

public class Task1 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дан текст(строка). Найдите наибольшее количество подряд идущих пробелов в нем.");
        System.out.print("введите строку");
        String str = enterString();

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}

