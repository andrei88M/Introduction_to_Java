package task._03_string_and_basic_of_text_processing.working_with_a_string_as_with_an_array_of_characters;

import task.Task;

import java.util.Arrays;

public class Task1 implements Task {
    @Override
    public void solving() {
        System.out.println("Дан массив названий переменных в camelCase.Преобразовать названия в snake_case.");
        String[] arr = new String[]{"camelCase", "snakeCase", "nameCase"};
        System.out.println(Arrays.toString(arr));
        for (String str : arr) {
            System.out.println(getSnakeCase(str));
        }
    }

    private String getSnakeCase(String str) {
        for (int i = 1; i < str.length(); i++) {
            boolean bool = str.substring(i, i + 1).equals(str.substring(i, i + 1).toLowerCase());
            if (!bool) {
                String str1 = str.substring(0,i);
                String str2 = "_" + str.substring(i).toLowerCase();
                return str1 + str2;
            }
        }
        return str;
    }
}
