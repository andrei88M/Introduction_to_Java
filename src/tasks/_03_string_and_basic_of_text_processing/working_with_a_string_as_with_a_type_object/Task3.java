package tasks._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object;

import tasks.AbstractTask;
import tasks.Task;

public class Task3 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Проверить, является ли заданное слово палиндромом.");
        System.out.print("введите строку ");
        String str = scanner.nextLine();

        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("не является");
                break;
            } else if (i == (str.length() / 2) - 1 && str.charAt(i) == str.charAt(j)){
                System.out.println("является");
            }
        }
    }
}
