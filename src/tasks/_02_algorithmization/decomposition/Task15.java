package tasks._02_algorithmization.decomposition;

import tasks.AbstractTask;
import tasks.Task;

public class Task15 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Найти все натуральные n-значные числа, цифры в которых образают строго " +
                "\nвозрастающую последовательность(например, 1234, 5789). Для решения задачи использовать декомпозицию.");
        System.out.print("n = ");
        int n = scanner.nextInt();

        search(n);
    }

    private void search(int n) {
        boolean bool = true;
        for (int i = (int) Math.pow(10, n-1); i < (int) Math.pow(10, n); i++) {
            int numb2 = i;
            for (int j = 1; j < n; j++) {
                int numb = numb2 % 10;
                numb2 /= 10;
                if (numb > numb2 % 10) continue;
                bool = false;
                break;
            }
            if (bool) {
                System.out.println(i);
            } else {
                bool = true;
            }
        }
    }
}
