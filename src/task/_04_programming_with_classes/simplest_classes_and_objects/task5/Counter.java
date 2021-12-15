package task._04_programming_with_classes.simplest_classes_and_objects.task5;

public class Counter {
    private int count;
    private final int MIN = 0;
    private final int MAX = 9;

    public Counter() {
        count = 0;
    }

    public Counter(int count) {
        this.count = count;
    }

    public void enlarge() {
        count++;
        if (count > MAX) {
            count = MIN;
        }
    }

    public void decrease() {
        count--;
        if (count < MIN) {
            count = MAX;
        }
    }

    public void printResult(){
        System.out.println(count);
    }
}
