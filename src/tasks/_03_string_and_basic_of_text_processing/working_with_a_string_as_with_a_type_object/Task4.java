package tasks._03_string_and_basic_of_text_processing.working_with_a_string_as_with_a_type_object;

import tasks.AbstractTask;
import tasks.Task;

public class Task4 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("С помощью функции копирования и операции конкатенации составить из частей слова 'информатика' слово 'торт'");
        String str = "информатика";
        System.out.println(str);

        char[] tort = new char[4];
        str.getChars(7,8,tort,0);
        str.getChars(3,4,tort,1);
        str.getChars(4,5,tort,2);
        str.getChars(7,8,tort,3);
        System.out.println(tort);
    }
}
