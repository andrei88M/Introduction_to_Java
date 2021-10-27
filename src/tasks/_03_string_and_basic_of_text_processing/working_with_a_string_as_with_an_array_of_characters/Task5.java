package tasks._03_string_and_basic_of_text_processing.working_with_a_string_as_with_an_array_of_characters;

import tasks.AbstractTask;
import tasks.Task;

public class Task5 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов" +
                "\nзаменить на одиночные пробелы.Крайние пробелы в строке удалить.");
        System.out.print("введите строку ");
        String str = scanner.nextLine();

        str = str.trim();
        str = str.replaceAll("  +", " ");
        System.out.println(str);
    }
}
