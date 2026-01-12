package BankingSystem;

public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04;

    @Override
    public void calculateInterest() {
        balance += balance * INTEREST_RATE;
    }
}
