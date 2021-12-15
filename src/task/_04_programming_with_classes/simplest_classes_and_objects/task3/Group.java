package task._04_programming_with_classes.simplest_classes_and_objects.task3;

public class Group {
    private Student[] students;
    private int index = 0;

    public Group(int size) {
        students = new Student[size];
    }

    public void add(Student student) {
        if (index >= students.length) return;
        students[index] = student;
        index++;
    }

    public void printStudent9and10() {
        for (Student student : students) {
            if (student == null)continue;
            if (student.getPerformance() == null) continue;
            if (student.checkMarks()) {
                System.out.println(student.getSurname() + " " + student.getNumberGroup());
            }
        }
    }
}
