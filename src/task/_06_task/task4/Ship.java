package task._06_task.task4;

import java.util.ArrayDeque;
import java.util.Queue;

public class Ship {
    private int maxContainers;
    private Queue<Container> containerQueue;

    public Ship(int maxContainers) {
        this.maxContainers = Math.abs(maxContainers);
        containerQueue = new ArrayDeque<>(maxContainers);
    }

    public void addContainer(Container container) {
        containerQueue.add(container);
    }

    public Container removeContainer() {
        return containerQueue.poll();
    }

    public int getMaxContainers() {
        return maxContainers;
    }

    public int calculateContainer() {
        synchronized (containerQueue) {
            return containerQueue.size();
        }
    }

    @Override
    public String toString() {
        return "Ship{" +
                "maxContainers=" + maxContainers +
                ", containerQueue=" + containerQueue +
                '}';
    }
}
