package tasks._04_programming_with_classes.aggregation_and_composition.task4;

public class Account {
    private String customer;
    private String numberAccount = "account";
    private int money = 0;
    private static int number = 0;
    private boolean lock = false;

    public Account(String customer) {
        this.customer = customer;
        numberAccount += number++;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public String getCustomer() {
        return customer;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public int getMoney() {
        return money;
    }

    public boolean isLock() {
        return lock;
    }

    public void plusMoney(int money) {
        this.money += money;
    }

    public void minusMoney(int money) {
        this.money -= money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer='" + customer + '\'' +
                ", numberAccount='" + numberAccount + '\'' +
                ", money=" + money +
                '}';
    }
}
