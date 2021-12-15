package task._04_programming_with_classes.aggregation_and_composition.task5.bean;

import task._04_programming_with_classes.aggregation_and_composition.task5.tourist_services.Eat;
import task._04_programming_with_classes.aggregation_and_composition.task5.tourist_services.Transport;

public class AgencyService {
    private Eat eat;
    private Transport transport;

    public AgencyService(Eat eat, Transport transport) {
        this.eat = eat;
        this.transport = transport;
    }

    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
