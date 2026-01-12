package BankingSystem;

public interface TransactionService {
    void deposit(int customerId, double amount);
    void withdraw(int customerId, double amount) throws InsufficientBalanceException;
    double checkBalance(int customerId);
}
