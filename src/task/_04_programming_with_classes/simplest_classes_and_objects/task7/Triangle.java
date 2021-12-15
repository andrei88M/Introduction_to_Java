package task._04_programming_with_classes.simplest_classes_and_objects.task7;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public void setABC(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a + c <= b || a + b <= c || c + b <= a) {
            System.out.println("треугольника не существует");
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    public double p() {
        return (a + b + c) / 2d;
    }

    public double s() {
        double p = p();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
