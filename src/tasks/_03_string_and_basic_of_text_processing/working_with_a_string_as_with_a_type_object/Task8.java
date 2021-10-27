package tasks._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object;

import tasks.AbstractTask;
import tasks.Task;

public class Task8 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран." +
                "\nСлучай, когда самых длинных слов может быть несколько, не обрабатывать.");
        System.out.print("введите строку");
        String str = scanner.nextLine();

        String size = "";
        String[] strings = str.split("\\W");
        for (String s : strings) {
            if (s.length() > size.length()){
                size = s;
            }
        }
        System.out.println(size);
    }
}
