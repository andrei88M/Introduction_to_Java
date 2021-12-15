package task._06_task.task2.console;

import task._06_task.task2.controller.Commands;
import task._06_task.task2.controller.Controller;

import java.util.Scanner;

public class Console {
    private String response = "";
    private String request;
    private Controller controller;

    public Console() {
        controller = new Controller();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (!response.equalsIgnoreCase("EXIT")) {
            System.out.print(">>");
            String request = scanner.nextLine();

            if (request.split("\\W").length < 2) {
                continue;
            }
            response = controller.controller(request);
            System.out.println(response);
        }
    }
}
