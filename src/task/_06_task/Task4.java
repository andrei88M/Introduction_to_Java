package task._06_task;

import task.Task;
import task._06_task.task4.Port;

/*Корабли заходят в порт для разгрузки/разгрузки контейнеров. Число контейнеров, находящихся в текущий момент
 * в порту и на корабле, должно быть неотрицательным и превышающим заданную грузоподъемность судна и вместимость
 * порта. В порту работает несколько причалов. У одного причала может стоять один корабль. Корабль может загружаться
 * у причала или разгружаться.*/
public class Task4 implements Task {

    @Override
    public void solving() {
     Port port = new Port(3,100);
     port.startWork();

    }

}
