package tasks._05_basic_of_oop.task4;

public abstract class Cave {
    private Treasure[] treasures;

    {
        treasures = new Treasure[100];
        for (int i = 0; i < treasures.length; i++) {
            treasures[i] = new Treasure((int) (Math.random() * 99 + 1), "name" + i);
        }
    }

    public void look() {
        for (Treasure treasure : treasures) {
            System.out.println(treasure);
        }
    }

    public void searchPrice(int price) {
        for (int i = 0; i < treasures.length; i++) {
            if (treasures[i].getPrice() == price){
                System.out.println(treasures[i]);
            }
        }
    }

    public void findMostExpensive() {
        int index = 0;
        int max = 0;
        for (int i = 0; i < treasures.length; i++) {
            if (treasures[i].getPrice() > max) {
                max = treasures[i].getPrice();
                index = i;
            }
        }
        System.out.println(treasures[index]);
    }
}
