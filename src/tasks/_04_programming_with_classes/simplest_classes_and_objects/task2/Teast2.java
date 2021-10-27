package tasks._04_programming_with_classes.simplest_classes_and_objects.task2;
/*Cоздайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
 * инициализирующий члены по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.*/
public class Teast2 {
    private int numb1;
    private int numb2;

    public Teast2() {
        numb1 = 0;
        numb2 = 1;
    }

    public Teast2(int numb1, int numb2) {
        this.numb1 = numb1;
        this.numb2 = numb2;
    }

    public int getNumb1() {
        return numb1;
    }

    public void setNumb1(int numb1) {
        this.numb1 = numb1;
    }

    public int getNumb2() {
        return numb2;
    }

    public void setNumb2(int numb2) {
        this.numb2 = numb2;
    }
}
