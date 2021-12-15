package task._04_programming_with_classes.aggregation_and_composition;

import task.Task;
import task._04_programming_with_classes.aggregation_and_composition.task4.Account;
import task._04_programming_with_classes.aggregation_and_composition.task4.Bank;
import task._04_programming_with_classes.aggregation_and_composition.task4.Client;
import task._04_programming_with_classes.aggregation_and_composition.task4.BankLogic;

public class Task4 implements Task {
    @Override
    public void solving() {
        System.out.println("Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки\n" +
                "счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,\n" +
                "имеющим положительный и отрицательный балансы отдельно.\n");
        Client client = new Client(1, "name", "surname");
        Account account = new Account(1, 100, client, false);
        Bank bank = new Bank("minsk");

        BankLogic bankLogic = new BankLogic(bank);
        bankLogic.sortAccount();
        bankLogic.lockAccount(1);
        bankLogic.calculateMoneyPlus(1);
        bankLogic.unlockAccount(1);
        bankLogic.search(1);

    }
}
