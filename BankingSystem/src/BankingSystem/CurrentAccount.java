package BankingSystem;


public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("No interest for Current Account");
    }
}

