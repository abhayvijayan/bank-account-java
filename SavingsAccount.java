public class SavingsAccount extends BankAccount{

    public SavingsAccount(long accountNumber,  Customer customer) {
        super(accountNumber, "Savings", customer);
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0 || amount > super.TRANSACTION_LIMIT) {
            System.out.println("Amount must be between 1 - " + super.TRANSACTION_LIMIT);
            return;
        }

        if (amount > getBalance()) {
            System.out.println("Insufficient balance!");
            return;
        }

        System.out.println("Withdraw : " + amount);
        setBalance(getBalance() - amount);
        System.out.println("New Balance : " + getBalance());
    }
}
