package task._06_task.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Port {
    public static int count;
    private final int maxCont;
    private int quantityPiers;
    private Manager manager;
    public List<Container> contList;

    public Port(int quantityPiers, int maxCont) {
        this.quantityPiers = quantityPiers;
        this.maxCont = maxCont;
        manager = new Manager();
        contList = new ArrayList<>();
        count = contList.size();
    }

    public void startWork() {
        Pier pier;
        Ship ship;
        Runnable runnable;
        Generator generator;
        ExecutorService executorPier;
        ExecutorService executorManager;

        generator = new Generator();
        runnable = () -> manager.addShips(generator.createShips(5, 10));
        executorPier = Executors.newFixedThreadPool(quantityPiers);
        executorManager = Executors.newCachedThreadPool();

        while (true) {
            if (manager.getShipQueue().size() == 0) {
                executorManager.submit(runnable);
                Thread.yield();
            }
            ship = manager.removeShip();
            if (ship == null) {
                continue;
            }
            pier = new Pier(contList, maxCont);
            pier.setShip(ship);
            executorPier.submit(pier);
        }
    }

}
