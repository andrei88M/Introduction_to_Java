package tasks._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object;

import tasks.AbstractTask;
import tasks.Task;

public class Task9 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Посчитать количество строчных и прописных букв в введенной строке." +
                "\nУчитывать только английские буквы.");
        System.out.print("введите строку");
        String str = scanner.nextLine();

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            int c =  str.charAt(i);
            if ( c >= 65 &&  c <= 90) {
                count1++;
            } else if ( c >= 97 && c <= 122) {
                count2++;
            }
        }
        System.out.println("Больших " + count1 + " маленьких " + count2);

    }
}
