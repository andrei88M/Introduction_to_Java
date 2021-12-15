package task._01_basics_of_software_code_development.lineaPrograms;

import task.AbstractTask;
import task.Task;

public class Task6 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Для данной области составить линейную программу, которая печатает true, если точка с координатами(х,у)" +
                "\nпринадлежит закрашенной области, и false-в противном случае");
        System.out.print("x = ");
        int x = enterInt();
        System.out.print("y = ");
        int y = enterInt();

        boolean aBoolean;
        aBoolean = (y > 0 && y <= 4) && (x >= -2 && x <= 2)
                || (y <= 0 && y >= -3) && (x >= -4 && x <= 4);
        System.out.println(aBoolean);
    }
}
