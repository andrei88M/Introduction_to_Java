package task._05_basic_of_oop.task1;

public class File {
    private String text;

    public File() {
    }

    public File(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String text) {
        this.text += " " + text;
    }

    public void delete(){
        text = "";
    }

    @Override
    public String toString() {
        return text;
    }
}
