package nierth.learnjava.DInheritance.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
                "12345", 0.00, "Bob Brown", "myEmail@gmail.com", "(001) 01235"
        );
        System.out.println(account.getAccountNumber());
        System.out.println(account.getCustomerName());
        System.out.println(account.getBalance());
        account.withdraw(100.0);
        account.deposit(350.0);
        account.withdraw(50.0);

        BankAccount defaultCustomer = new BankAccount();
        System.out.println(defaultCustomer.getAccountNumber());
        System.out.println(defaultCustomer.getCustomerName());
        System.out.println(defaultCustomer.getBalance());
    }
}
