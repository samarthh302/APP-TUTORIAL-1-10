package Week5;
// Tutorial1.java
/*
Abstraction:
- We create an abstract class Account with a method calculateInterest().
- All account types (Savings, Current, Loan) must implement calculateInterest().
- Each account type can have its own interest calculation.
*/

abstract class Account {
    String accountNumber;
    double balance;

    // Abstract method forces subclasses to provide implementation
    abstract double calculateInterest();
}

class SavingsAccount extends Account {
    double interestRate = 0.04;

    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}

class CurrentAccount extends Account {
    double interestRate = 0.02;

    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}

class LoanAccount extends Account {
    double interestRate = 0.1;

    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}

public class Tutorial1 {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount();
        acc1.balance = 50000;
        System.out.println("Savings Account Interest: " + acc1.calculateInterest());

        Account acc2 = new LoanAccount();
        acc2.balance = 100000;
        System.out.println("Loan Account Interest: " + acc2.calculateInterest());
    }
}
