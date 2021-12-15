package task._04_programming_with_classes.aggregation_and_composition.task4;

import task._04_programming_with_classes.aggregation_and_composition.task4.Account;
import task._04_programming_with_classes.aggregation_and_composition.task4.Bank;

import java.util.Comparator;
import java.util.List;

public class BankLogic {
    private Bank bank;

    public BankLogic(Bank bank) {
        this.bank = bank;
    }

    public int calculateMoney(int id) {
        int sum = 0;
        for (Account account : bank.getAccounts()) {
            int idClient = account.getClient().getId();
            if (idClient != id) {
                continue;
            }
            sum += account.getMoney();
        }
        return sum;
    }

    public int calculateMoneyMinus(int id) {
        int sum = 0;
        for (Account account : bank.getAccounts()) {
            int idClient = account.getClient().getId();
            if (idClient != id && account.getMoney() >= 0) {
                continue;
            }
            sum += account.getMoney();
        }
        return sum;
    }

    public int calculateMoneyPlus(int id) {
        int sum = 0;
        for (Account account : bank.getAccounts()) {
            int idClient = account.getClient().getId();
            if (idClient != id && account.getMoney() <= 0) {
                continue;
            }
            sum += account.getMoney();
        }
        return sum;
    }

    public void sortAccount() {
        List<Account> accountList = bank.getAccounts();
        accountList.sort(Comparator.comparingInt(Account::getId));
    }

    public Account search(int id) {
        for (Account account : bank.getAccounts()) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    public boolean lockAccount(int id) {
        Account account;
        account = search(id);
        if (account == null) {
            return false;
        }
        account.isBlock(true);
        return true;
    }

    public boolean unlockAccount(int id) {
        Account account;
        account = search(id);
        if (account == null) {
            return false;
        }
        account.isBlock(false);
        return true;
    }

}
