package BankingSystem;

public class Customer {
    private final int id;
    private String name;
    private Account account;

    public Customer(int id, String name, Account account) {
        this.id = id;
        this.name = name;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + name + ", " + account;
    }
}
