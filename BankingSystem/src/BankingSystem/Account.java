package BankingSystem;

public abstract class Account {
    protected double balance;

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void calculateInterest();

    @Override
    public String toString() {
        return "Balance: " + balance;
    }
}
