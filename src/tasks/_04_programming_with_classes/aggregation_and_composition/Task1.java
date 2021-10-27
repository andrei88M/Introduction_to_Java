package tasks._04_programming_with_classes.aggregation_and_composition;

import tasks.Task;
import tasks._04_programming_with_classes.aggregation_and_composition.task1.Sentence;
import tasks._04_programming_with_classes.aggregation_and_composition.task1.Text;
import tasks._04_programming_with_classes.aggregation_and_composition.task1.Word;

public class Task1 implements Task {
    @Override
    public void solving() {
        System.out.println("Создать объект класса Текст, используя классы Предложение,Слово.\n" +
                "Методы: дополнить текст,вывести на консоль текст, заголовок текста.\n");
        Word word = new Word("word");
        Word word1 = new Word("word1");
        Sentence sentence = new Sentence();
        sentence.add(word);
        sentence.add(word1);

        Text text = new Text(word);
        text.add(sentence);
        System.out.println(text.getText());
        System.out.println(text.getHeader());

    }
}
