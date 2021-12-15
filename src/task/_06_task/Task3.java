package task._06_task;


import task.Task;
import task._06_task.task3.Client;
import task._06_task.task3.Server;

public class Task3 implements Task {

    @Override
    public void solving() {
        Server server = new Server();
        Thread thread = new Thread(server);
        Client client = new Client();
        Thread thread1 = new Thread(client);
        thread.start();
        thread1.start();
    }
}