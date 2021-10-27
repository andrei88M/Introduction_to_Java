package tasks._03_string_and_basic_of_text_processing.working_with_a_string_as_with_an_array_of_characters;

import tasks.AbstractTask;
import tasks.Task;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("в строке найти количество цифр");
        System.out.print("введите строку ");
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (getBoolean(str, i)) {
                count++;
            }
        }
        System.out.println("цифр в строке " + count);
    }
}
