package task._03_string_and_basic_of_text_processing.work_with_regular_expressions;

import task.Task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 implements Task {
    private String string = "Дана строка, содержащая следующий текст(xml-документ):\n" +
            "<notes>" +
            "  <note id = \"1\">" +
            "    <to>Вася</to>" +
            "    <from>Света</from>" +
            "    <heading>Напоминание</heading>" +
            "    <bode>Позвони мне завтра!</body>" +
            "  </note>" +
            "  <note id = \"2\">" +
            "    <to>Петя</to>" +
            "    <from>Маша</from>" +
            "    <heading>Важное напоминание</heading>" +
            "    </body>" +
            "  </note>" +
            "</notes>\n" +
            "Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип\n" +
            "(открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML \n" +
            "для решения данной задачи нельзя.\n\n";

    @Override
    public void solving() {
        String reg1 = "<\\w+>";
        String reg2 = "</\\w+>";
        Pattern pattern = Pattern.compile(reg1);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            String str = matcher.group();
            String str2 = "</" + str.substring(1);
            Pattern pattern1 = Pattern.compile(str+".+"+str2);
            Matcher matcher1 = pattern1.matcher(string);
            if (matcher1.find()){
                System.out.println(matcher1.group());
            }
        }

    }
}
