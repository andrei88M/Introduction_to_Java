package task._05_basic_of_oop.task4;

public class Dragon extends Cave {

    public void saysDragon() {
        while (true) {
            System.out.println("1 - посмотреть все сокровища");
            System.out.println("2 - найти самое дорогое сокровище");
            System.out.println("3 - ручной поиск сокровища");
            System.out.println("0 - досвидание");
            int numb = enterInt(0, 3);
            if (numb == 1) {
                look();
            } else if (numb == 2) {
                findMostExpensive();
            } else if (numb == 3) {
                search();
            } else if (numb == 0) {
                break;
            }
        }
    }

    private void search() {
        System.out.print("введите стоимость искомого сокровища");
        int price = enterInt(0, Integer.MAX_VALUE);
        searchPrice(price);
    }
}
