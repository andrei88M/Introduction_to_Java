package tasks._03_string_and_basic_of_text_processing.work_with_regular_expressions;

import tasks.Task;

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
            "    <body/>" +
            "  </note>" +
            "</notes>\n" +
            "Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип\n" +
            "(открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML \n" +
            "для решения данной задачи нельзя.";

    @Override
    public void solving() {

    }
}
