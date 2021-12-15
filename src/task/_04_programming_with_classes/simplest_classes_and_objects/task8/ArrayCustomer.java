package task._04_programming_with_classes.simplest_classes_and_objects.task8;

public class ArrayCustomer {
    private int index = 0;
    private Customer[] customers;

    public ArrayCustomer(int size) {
        this.customers = new Customer[size];
    }

    public void add(Customer customer) {
        customers[index] = customer;
        index++;
    }

    public void printCustomers() {
        for (Customer customer : customers) {
            if (customer == null) continue;
            System.out.println(customer);
        }
    }

    public void sort1() {
        for (int i = 0; i < customers.length; i++) {
            String nameI = customers[i].getName();
            for (int j = i + 1; j < customers.length; j++) {
                String nameJ = customers[j].getName();
                if (nameI.compareToIgnoreCase(nameJ) > 0) {
                    Customer customer = customers[i];
                    customers[i] = customers[j];
                    customers[j] = customer;
                    nameI = customers[i].getName();
                }
            }
        }
    }

    public void printCart(int from, int to) {
        for (Customer customer : customers) {
            if (customer.getNumberCart() >= from && customer.getNumberCart() <= to){
                System.out.println(customer);
            }
        }
    }
}
