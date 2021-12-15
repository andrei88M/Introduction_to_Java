package task._03_string_and_basic_of_text_processing.work_with_regular_expressions;

import task.AbstractTask;
import task.Task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Создать приложение, разбирающее текст(текст хранить в структуре) и позволяющее" +
                "\nвыполнить с текстом три различных операции: отсортировать абзацы по количеству предложений;" +
                "\nв каждом предложении отсортировать слова по длине; отсортировать лексемы в предложении по " +
                "\nубыванию количества вхождений заданного символа, а в случае равенства - по алфавиту.\n");
        String str = enterString(3);
        System.out.println();

        System.out.println(sort1(str));
        System.out.println(sort2(str));
    }

    private String sort1(String str) {
        String[] strings;
        int[] quantityWords;

        strings = str.split("\\n +");
        quantityWords = new int[strings.length];

        Pattern pattern = Pattern.compile("\\b");
        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            Matcher matcher = pattern.matcher(strings[i]);
            while (matcher.find()) {
                count++;
            }
            quantityWords[i] = count / 2;
        }
        for (int i = 0; i < quantityWords.length; i++) {
            int min = i;
            for (int j = i + 1; j < quantityWords.length; j++) {
                if (quantityWords[i] > quantityWords[j]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = quantityWords[i];
                quantityWords[i] = quantityWords[min];
                quantityWords[min] = temp;
                String temp2 = strings[i];
                strings[i] = strings[min];
                strings[min] = temp2;
            }
        }
        StringBuilder newStr = new StringBuilder();
        for (String s : strings) {
            newStr.append(s).append("\n ");
        }
        return newStr.toString();
    }

    private String sort2(String str) {
        String[] strings = str.split("\\b\\W+\\b");
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].length() > strings[j].length()) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        StringBuilder newStr = new StringBuilder();
        for (String s : strings) {
            newStr.append(s).append(" ");
        }
        return newStr.toString();
    }

    private String sort3(String str) {
        String ch = enterChar();

        return null;
    }
}
