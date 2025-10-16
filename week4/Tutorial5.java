package Week4;
// Tutorial5.java
class Account {
    int accountNumber;
    double[] transactions;

    Account(int accountNumber, double[] transactions) {
        this.accountNumber = accountNumber;
        this.transactions = transactions;
    }

    double largestDeposit() {
        double max = transactions[0];
        for (double t : transactions) {
            if (t > max) max = t;
        }
        return max;
    }
}

public class Tutorial5 {
    public static void main(String[] args) {
        Account[] accounts = {
            new Account(101, new double[]{1000, 2500, 3000, 1500}),
            new Account(102, new double[]{5000, 2000, 1000, 800}),
            new Account(103, new double[]{1200, 4500, 600, 2000})
        };

        Account maxAcc = accounts[0];
        for (Account a : accounts) {
            if (a.largestDeposit() > maxAcc.largestDeposit())
                maxAcc = a;
        }

        System.out.println("Account with largest single deposit: " + maxAcc.accountNumber);
        System.out.println("Largest deposit: ₹" + maxAcc.largestDeposit());
    }
}

