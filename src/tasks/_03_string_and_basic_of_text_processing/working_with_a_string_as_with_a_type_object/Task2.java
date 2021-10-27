package tasks._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object;

import tasks.AbstractTask;
import tasks.Task;

public class Task2 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("В строке вставить после каждого символа 'a' символ 'b'.");
        System.out.print("введите строку ");
        String str = scanner.nextLine();

        str = str.replaceAll("a", "ab");
        System.out.println(str);
    }
}
