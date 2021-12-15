package task._06_task.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable {
    @Override
    public void run() {
        Thread.yield();
        try {
            Socket socket = new Socket("127.0.0.1", 8080);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in);
            while (!socket.isOutputShutdown()) {
                System.out.print("save/update/see/close  >>");
                String scan = scanner.nextLine();
                out.println(scan);

                Thread.yield();
                switch (scan) {
                    case "save" -> {
                        save(out, scanner);
                    }
                    case "update" -> {
                        update(out, in, scanner);
                    }
                    case "see" -> {
                        System.out.print("enter mail: ");
                        String mail = scanner.nextLine();
                        see(out, in, mail);
                    }
                    case "close" -> {
                        out.println("close");
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void update(PrintWriter out, BufferedReader in, Scanner scanner) throws IOException {
        System.out.print("mail:");
        String mail = scanner.nextLine();

        out.println(mail);
        String name = in.readLine();
        String surname = in.readLine();
        String text = in.readLine();

        Student student = new Student(name, surname, mail, text);
        System.out.print("update name " + name + ": ");
        student.setName(scanner.nextLine());
        System.out.print("update surname"  + surname + ": ");
        student.setSurname(scanner.nextLine());
        System.out.print("update text " + text + ": ");
        student.setText(scanner.nextLine());
        saveOrUpdate(out, student);
    }

    private void save(PrintWriter out, Scanner scanner) {
        System.out.print("name:");
        String name = scanner.nextLine();
        Thread.yield();
        System.out.print("surname:");
        String surname = scanner.nextLine();
        Thread.yield();
        System.out.print("mail:");
        String mail = scanner.nextLine();
        Thread.yield();
        System.out.print("text:");
        String text = scanner.nextLine();
        Thread.yield();
        Student student = new Student(name, surname, mail, text);
        saveOrUpdate(out, student);
        Thread.yield();
    }

    private void saveOrUpdate(PrintWriter out, Student student) {
        out.println(student.getName());
        Thread.yield();
        out.println(student.getSurname());
        Thread.yield();
        out.println(student.getText());
    }

    public void see(PrintWriter out, BufferedReader in, String mail) throws IOException {
        System.out.print("enter mail: ");
        out.println(mail);

        String name = in.readLine();
        String surname = in.readLine();
        String text = in.readLine();

        System.out.println(name + " " + surname + " " + text);
    }
}
