package task._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object;

import task.AbstractTask;
import task.Task;

public class Task7 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы." +
                "\nНапример, если было введено \"abc cde def\", то должно быть выведено \"abcdef\".");
        System.out.print("введите строку ");
        StringBuilder stringBuilder = new StringBuilder(enterString());

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i)==' '){
                stringBuilder.deleteCharAt(i);
                i--;
                continue;
            }
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                    stringBuilder.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
