package tasks._05_basic_of_oop.task4;

import java.util.Scanner;

public class Dragon extends Cave {
    private Scanner scanner = new Scanner(System.in);

    public void saysDragon() {
        while (true) {
            System.out.println("1 - посмотреть все сокровища");
            System.out.println("2 - найти самое дорогое сокровище");
            System.out.println("3 - ручной поиск сокровища");
            System.out.println("0 - досвидание");
            int numb = scanner.nextInt();
            if (numb == 1) {
                look();
            } else if (numb == 2) {
                findMostExpensive();
            } else if (numb == 3) {
                search();
            }else if (numb == 0){
                break;
            }
        }
    }

    private void search() {
        System.out.print("введите стоимость искомого сокровища");
        int price = scanner.nextInt();
        searchPrice(price);
    }
}
