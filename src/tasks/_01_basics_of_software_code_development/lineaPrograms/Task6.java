package tasks._01_basics_of_software_code_development.lineaPrograms;

import tasks.AbstractTask;
import tasks.Task;

public class Task6 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Для данной области составить линейную программу, которая печатает true, если точка с координатами(х,у)" +
                "\nпринадлежит закрашенной области, и false-в противном случае");
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();

        boolean aBoolean = (y > 0 && y <= 4) && (x >= -2 && x <= 2)
                || (y <= 0 && y >= -3) && (x >= -4 && x <= 4);
        System.out.println(aBoolean);
    }
}
