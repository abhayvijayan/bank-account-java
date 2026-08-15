public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Abhay Vijayan", "abhayvapvl@gmail.com", 9074890111L);

        BankAccount account1 = new SavingsAccount(1001L, customer1);
        BankAccount account2 = new CurrentAccount(1001L, customer1);

        account1.deposit(20000);
        account2.deposit(20000);

        account1.withdraw(20001);
        account2.withdraw(25000);

        account1.displayAccountDetails();
        account2.displayAccountDetails();

    }
}
