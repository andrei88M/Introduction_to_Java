package task._06_task.task4;

import java.util.List;

public class Pier implements Runnable {
    private Ship ship;
    private final int maxCont;
    private final List<Container> contList;

    public Pier(List<Container> contList, int maxCont) {
        this.contList = contList;
        this.maxCont = maxCont;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void unloading() {
        if (ship == null) {
            return;
        }
        synchronized (contList) {
            int shipSize = ship.calculateContainer();
            if (shipSize > maxCont - Port.count) {
                return;
            }
            Port.count = Port.count + shipSize;
        }
        Container container;
        while (ship.calculateContainer() > 0) {
            container = ship.removeContainer();
            if (container == null) {
               Port.count--;
                continue;
            }
            synchronized (contList) {
                contList.add(container);
                System.out.println(">>>");
            }

        }
        ship = null;
    }

    public void loading() {
        if (ship == null) {
            return;
        }
        synchronized (contList) {
            if (Port.count < ship.getMaxContainers()) {
                return;
            }
            Port.count = Port.count - ship.getMaxContainers();

        }
        Container container;
        while (ship.calculateContainer() < ship.getMaxContainers()) {
            synchronized (contList) {
                container = contList.remove(0);
                if (container == null) {
                    Port.count++;
                    continue;
                }
                ship.addContainer(container);
                System.out.println("<<");
            }

        }
        ship = null;
    }

    @Override
    public void run() {
        if (ship == null) {
            return;
        }
        if (ship.calculateContainer() == 0) {
            loading();
        } else {
            unloading();
        }
    }
}
