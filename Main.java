public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Abhay Vijayan", "abhayvapvl@gmail.com", 9074890111L);
        BankAccount account = new BankAccount(101L, "Savings", customer);

        customer.displayDetails();
        account.displayAccountDetails();

        account.deposit(2000);

        account.withdraw(100);
    }
}
