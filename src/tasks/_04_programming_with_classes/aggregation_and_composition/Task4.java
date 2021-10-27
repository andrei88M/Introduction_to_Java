package tasks._04_programming_with_classes.aggregation_and_composition;

import tasks.Task;
import tasks._04_programming_with_classes.aggregation_and_composition.task4.Bank;

public class Task4 implements Task {
    @Override
    public void solving() {
        System.out.println("Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки\n" +
                "счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,\n" +
                "имеющим положительный и отрицательный балансы отдельно.\n");
        Bank bank = new Bank();
        bank.create("name");
        bank.create("name");
        bank.create("name3");
        bank.create("name2");
        bank.printAll();
        System.out.println();

        bank.search("name");
        bank.sort1();
        System.out.println();
        bank.printAll();

        bank.block("account0");
        bank.calculateAllMoney("name");
        bank.calculateAllMoney2("name2");
    }
}
