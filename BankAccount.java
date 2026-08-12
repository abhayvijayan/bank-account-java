public class BankAccount {
    private Long accountNumber;
    private int balance;
    private String accountType;
    private Customer customer;

    public BankAccount(Long accountNumber, String accountType, Customer customer) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.customer = customer;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return;
        }
        System.out.println("Deposit : " + amount);
        this.balance += amount;
        System.out.println("New balance : " + this.balance);
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0!");
            return;
        }
        System.out.println("Withdraw : " + amount);
        this.balance -= amount;
        System.out.println("New Balance : " + this.balance);
    }

    public int getBalance() {
        return this.balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account");
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Type : " + this.accountType);
        System.out.println("Account Balance : " + this.balance);
    }
}
