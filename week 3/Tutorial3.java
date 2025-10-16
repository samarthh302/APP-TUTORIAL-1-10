package Week3;

// Tutorial3.java
class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println();
    }
}

public class Tutorial3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNumber = 123456;
        acc.accountHolder = "John Doe";
        acc.balance = 25000;

        acc.displayBalance();
    }
}
