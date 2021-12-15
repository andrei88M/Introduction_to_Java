package task._06_task.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(8080);
            Socket client = server.accept();
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            while (!server.isClosed()) {

                String inStr = in.readLine();
                switch (inStr) {
                    case "save" -> save(in);
                    case "update" -> update(in, out);
                    case "see" -> see(out, in);
                    case "close" -> server.close();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save(BufferedReader in) throws IOException {
        String name = in.readLine();
        String surname = in.readLine();
        String mail = in.readLine();
        String text = in.readLine();

        Student student = new Student(name, surname, mail, text);
        DAO dao = new DAO();
        dao.save(student);
    }

    private void update(BufferedReader in, PrintWriter out) throws IOException {
        DAO dao = new DAO();
        String mail = in.readLine();

        Student student = dao.get(mail);
        out.println(student.getName());
        Thread.yield();
        out.println(student.getSurname());
        Thread.yield();
        out.println(student.getText());
        Thread.yield();

        String name = in.readLine();
        String surname = in.readLine();
        String text = in.readLine();

        student.setName(name);
        student.setSurname(surname);
        student.setText(text);

        dao.update(student);
    }

    private void see(PrintWriter out, BufferedReader in) throws IOException {
        String mail = in.readLine();
        DAO dao = new DAO();
        Student student = dao.get(mail);

        out.println(student.getName());
        Thread.yield();
        out.println(student.getSurname());
        Thread.yield();
        out.println(student.getText());
        Thread.yield();
    }
}
