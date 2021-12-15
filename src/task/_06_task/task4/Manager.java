package task._06_task.task4;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Manager {
    private Queue<Ship> shipQueue;

    public Manager() {
        shipQueue = new ArrayDeque<>();
    }

    public void addShips(List<Ship> shipList) {
        if (shipList == null || shipList.size() == 0) {
            return;
        }
        synchronized (shipQueue) {
            shipQueue.addAll(shipList);
        }
    }

    public Ship removeShip(){
        Ship ship;
        synchronized (shipQueue){
            ship = shipQueue.poll();
        }
        return ship;
    }

    public Queue<Ship> getShipQueue() {
        return shipQueue;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "shipQueue=" + shipQueue +
                '}';
    }
}
