public class CurrentAccount extends BankAccount{

    CurrentAccount(long accountNumber, Customer customer) {
        super(accountNumber, "Current", customer);
    }

    private static final int OVERDRAFT_LIMIT = 5000;

    @Override
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Amount must be between 1 - " + super.TRANSACTION_LIMIT);
            return;
        }

        if (amount > (getBalance() + OVERDRAFT_LIMIT)) {
            System.out.println("Insufficient balance!");
            return;
        }

        System.out.println("Withdraw : " + amount);
        setBalance(getBalance() - amount);
        System.out.println("New Balance : " + getBalance());
    }
}