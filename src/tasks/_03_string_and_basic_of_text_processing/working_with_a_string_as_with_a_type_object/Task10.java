package tasks._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object;

import tasks.AbstractTask;
import tasks.Task;

public class Task10 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Строка X состоит из нескольких предложений, каждое из которых кончается точкой," +
                "\nвосклицательным или вопросительным знаком.Определить количество предложений в строке X.");
        System.out.print("X = ");
        String x = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            boolean bool = c == '.' || c == '!' || c == '?';
            if (bool && i != x.length() - 1) {
                c = x.charAt(i + 1);
                bool = c == '.' || c == '!' || c == '?';
                if (!bool) {
                    count++;
                }
            } else if (bool) {
                count++;
            }

        }
        System.out.println(count);
    }
}
