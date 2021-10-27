package tasks._04_programming_with_classes.simplest_classes_and_objects.task1;
/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.*/

public class Test1 {
   private int numb1;
    private int numb2;

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

    public void printSum() {
        System.out.println(numb1 + numb2);
    }

    public void printMax() {
        System.out.println(Math.max(numb1, numb2));
    }
}
