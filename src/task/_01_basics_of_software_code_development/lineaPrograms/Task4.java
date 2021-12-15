package task._01_basics_of_software_code_development.lineaPrograms;

import task.AbstractTask;
import task.Task;

public class Task4 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях)." +
                "\nПоменять местами дробную и целую части числа и вывести полученное значение числа");
        System.out.print("n = ");
        int n = enterInt();
        System.out.print("d = ");
        int d = enterInt();

        double r = 111 * n + 0.111 * d;
        System.out.println(r);
        int tempR = (int) (r * 1000);
        n = tempR / 100000;
        d = tempR % 10;
        System.out.println(d * 111 + n * 0.111);
    }
}
