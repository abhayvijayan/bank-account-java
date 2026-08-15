interface Transactionable {

    int TRANSACTION_LIMIT = 20000;

    void withdraw(int amount);
    void deposit(int amount);
}

abstract class BankAccount implements Transactionable {
    private long accountNumber;
    private int balance;
    private String accountType;
    private Customer customer;

    public BankAccount(Long accountNumber, String accountType, Customer customer) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.customer = customer;
    }

    @Override
    public void deposit(int amount) {
        if (amount <= 0 || amount > TRANSACTION_LIMIT) {
            System.out.println("Amount must be between 0 - " + TRANSACTION_LIMIT);
            return;
        }
        System.out.println("Deposit : " + amount);
        this.balance += amount;
        System.out.println("New balance : " + this.balance);
    }

    @Override
    public abstract void withdraw(int amount);

    protected int getBalance() {
        return this.balance;
    }

    protected void setBalance(int balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account");
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Type : " + this.accountType);
        System.out.println("Account Balance : " + this.balance);
    }
}
