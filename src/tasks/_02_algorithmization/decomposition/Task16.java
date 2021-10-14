package tasks._02_algorithmization.decomposition;

import service.AbstractTask;
import service.Task;

public class Task16 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Написать программу, определяющую сумму n - значных чисел, содержащих только" +
                "\nнечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для решения" +
                "\nзадачи использовать декомпозицию.");
        System.out.print("n = ");
        int n = scanner.nextInt();

        long sum = searchSum(n);
        System.out.println(sum);
       int count = searchEven(sum);
        System.out.println(count);

    }

    private long searchSum(int n) {
        boolean bool = true;
        long sum = 0;
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            int numb2 = i;
            for (int j = 1; j < n; j++) {
                int numb = numb2 % 10;
                numb2 /= 10;
                if (numb % 2 != 0) continue;
                bool = false;
                break;
            }
            if (bool) {
                sum += i;
            } else {
                bool = true;
            }
        }
        return sum;
    }

    private int searchEven(long sum) {
        int count = 0;
        while (sum > 0) {
            count++;
            byte numb = (byte) (sum % 10);
            sum = sum / 10;
            if (numb % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
