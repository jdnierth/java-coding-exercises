package nierth.learnjava.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.withdraw(100.0);
        account.deposit(350.0);
        account.withdraw(50.0);
    }
}
