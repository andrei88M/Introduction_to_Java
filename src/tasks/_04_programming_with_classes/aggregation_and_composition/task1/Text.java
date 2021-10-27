package tasks._04_programming_with_classes.aggregation_and_composition.task1;

public class Text {
    private String text = "";
    private String header;


    public Text(Word word) {
        header = word.getWord();
    }

    public Text(Sentence sentence) {
        header = sentence.getStr();
    }

    public String getHeader() {
        return header;
    }

    public void add(Word word) {
        text += word.getWord() + " ";
    }

    public void add(Sentence sentence) {
        text += sentence.getStr() + " ";
    }

    public String getText() {
        return text;
    }
}
