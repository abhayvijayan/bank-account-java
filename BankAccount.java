public class BankAccount {
    private Long accountNumber;
    private int balance;
    private String accountType;
    private Customer customer;

    public BankAccount(Long accountNumber, String accountType, int balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.customer = customer;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return;
        }
        this.balance += amount;
    }
}
