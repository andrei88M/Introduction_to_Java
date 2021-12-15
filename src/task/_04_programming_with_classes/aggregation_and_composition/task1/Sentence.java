package task._04_programming_with_classes.aggregation_and_composition.task1;

public class Sentence {
    private String str = "";

    public void add(Word word) {
        str += word.getWord() + " ";
    }

    public String getStr() {
        return str;
    }
}
