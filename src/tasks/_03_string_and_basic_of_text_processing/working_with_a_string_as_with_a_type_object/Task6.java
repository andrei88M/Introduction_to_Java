package tasks._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object;

import tasks.AbstractTask;
import tasks.Task;

public class Task6 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Из заданной строки получить новую, повторив каждый символ дважды");
        System.out.print("введите строку ");
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        for (int i = stringBuilder.length() - 1; i >= 0; i--) {
            char ch = stringBuilder.charAt(i);
            stringBuilder.insert(i,ch);
        }
        System.out.println(stringBuilder);
    }
}
