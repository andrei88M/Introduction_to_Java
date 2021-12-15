package task._04_programming_with_classes.aggregation_and_composition.task4;

import java.util.Comparator;

public class Account {
    private final int id;
    private int money;
    private final Client client;
    private boolean block;

    public Account(int id, int money, Client client, boolean block) {
        this.id = id;
        this.money = money;
        this.client = client;
        this.block = block;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Client getClient() {
        return client;
    }

    public int getId() {
        return id;
    }

    public boolean isBlock() {
        return block;
    }

    public boolean isBlock(boolean b) {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", block=" + block +
                '}';
    }
}
