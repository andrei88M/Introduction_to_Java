package task._06_task.task4;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    public Ship createShip(int maxCont) {
        Ship ship;
        ship = new Ship(maxCont);
        if (Math.random()>=0.5){
            for (int i = 0; i < maxCont; i++) {
                ship.addContainer(new Container());
            }
        }
        return ship;
    }

    public List<Ship> createShips(int quantity, int maxContShip) {
        Ship ship;
        List<Ship> shipList;
        shipList = new ArrayList<>(quantity);
        for (int i = 0; i < quantity; i++) {
            ship = createShip(maxContShip);
            shipList.add(ship);
        }
        return shipList;
    }
}
