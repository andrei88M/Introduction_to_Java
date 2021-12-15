package task._04_programming_with_classes.simplest_classes_and_objects.task8;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String address;
    private int numberCart;
    private int numberBankAccount;

    public Customer() {
    }

    public Customer(int id, String surname, String name, String address, int numberCart, int numberBankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.numberCart = numberCart;
        this.numberBankAccount = numberBankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberCart() {
        return numberCart;
    }

    public void setNumberCart(int numberCart) {
        this.numberCart = numberCart;
    }

    public int getNumberBankAccount() {
        return numberBankAccount;
    }

    public void setNumberBankAccount(int numberBankAccount) {
        this.numberBankAccount = numberBankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numberCart=" + numberCart +
                ", numberBankAccount=" + numberBankAccount +
                '}';
    }
}
