package tasks._04_programming_with_classes.aggregation_and_composition.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void create(String customer) {
        Account account = new Account(customer);
        accounts.add(account);
    }

    public void search(String nameCustomer) {
        for (Account account : accounts) {
            if (account.getCustomer().equalsIgnoreCase(nameCustomer)) {
                System.out.println(account);
            }
        }
    }

    public void calculateAllMoney(String nameCustomer) {
        int sum = 0;
        for (Account account : accounts) {
            if (account.getCustomer().equals(nameCustomer)) {
                sum += account.getMoney();
            }
        }
        System.out.println(sum);
    }

    public void calculateAllMoney2(String nameCustomer) {
        int sum1 = 0;
        int sum2 = 0;
        for (Account account : accounts) {
            if (account.getCustomer().equals(nameCustomer)) {
                if (account.getMoney() > 0) {
                    sum1 += account.getMoney();
                } else {
                    sum2 += account.getMoney();
                }
            }
        }
        System.out.println(sum1 + " " + sum2);
    }

    public void sort1(){
        accounts.sort(new Comparator<Account>(){
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getCustomer().compareTo(o2.getCustomer());
            }
        });
    }
    public void printAll(){
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public void block(String numberAccount) {
        for (Account account : accounts) {
            if (account.getNumberAccount().equals(numberAccount)) {
                account.setLock(true);
                break;
            }
        }
    }

    public void unlock(String numberAccount) {
        for (Account account : accounts) {
            if (account.getNumberAccount().equals(numberAccount)) {
                account.setLock(false);
                break;
            }
        }
    }
}
