package tasks._02_algorithmization.decomposition;

import service.AbstractTask;
import service.Task;

public class Task11 extends AbstractTask implements Task {
    @Override
    public void solving() {
        System.out.println("Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.");
        System.out.print("Число1 = ");
        int number1 = scanner.nextInt();
        System.out.print("Число2 = ");
        int number2 = scanner.nextInt();

        int quantity1 = calculateNumber(number1);
        int quantity2 = calculateNumber(number2);
        if (quantity1 > quantity2){
            System.out.println("больше цифр в " + number1);
        }else if (quantity2> quantity1){
            System.out.println("больше цифр в " + number2);
        }else {
            System.out.println("одинаково");
        }
    }

    private int calculateNumber(int n){
        int count = 0;
        for (int i = n; i > 0; i /= 10) {
            count++;
        }
        return n;
    }
}
