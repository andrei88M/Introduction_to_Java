package tasks._04_programming_with_classes.simplest_classes_and_objects.task3;

/*Создайте класс с именем Student, содержащий поля:фамилия и инициалы, номер группы, успеваемость.
 * Создайте массив из десяти элементов такого типа. Добавьте возможномть вывода фамилий и номеров групп студентов,
 * имеющие оценки, равные только 9 или 10.*/
public class Student {
    private String surname;
    private String numberGroup;
    private int[] performance = new int[5];

    public Student(String surname, String numberGroup) {
        this.surname = surname;
        this.numberGroup = numberGroup;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(String numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void setPerformance(int[] performance) {
        this.performance = performance;
    }

    public boolean checkMarks() {
        for (int i : performance) {
            if (i < 9) {
                return false;
            }
        }
        return true;
    }

}
