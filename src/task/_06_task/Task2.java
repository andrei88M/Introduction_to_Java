package task._06_task;

import task.Task;
import task._06_task.task2.console.Console;

public class Task2 implements Task {
    /*Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками в блокноте.Каждая
     * Заметка это: Заметка(тема, дата создания, e-mail, сообщение).
     * Общее пояснение к практическому заданию.
     * - В начале работы приложения данные должны считываться из файла, в конце работы - сохраняться в файл.
     * - У пользователя должна быть возможность найти запись по любому параметру или по группе параметров
     * (группу параметров можно определить самостоятельно), получить требуемые записи в отсортированном виде,
     * найти записи, текстовое поле которой содержит определенное слово, а также добавить новую запись.
     * - Особое условие: поиск, сравнеие и валидацию вводимой информации осуществлять с использованием регулярных выражений.
     * - Особое условие: проверку введенной информации на валидность должен осуществлять код, непосредственно
     * добавляющий информацию.*/
    @Override
    public void solving() {
        Console console = new Console();
        console.start();
    }
}