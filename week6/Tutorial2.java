package Week6;
// Tutorial2.java
/*
Scenario:
- Base class Customer has method getDiscount().
- RegularCustomer and PremiumCustomer override getDiscount() to provide specific discount values.
*/

class Customer {
    double getDiscount() {
        return 0;
    }
}

class RegularCustomer extends Customer {
    @Override
    double getDiscount() {
        return 5; // 5% discount
    }
}

class PremiumCustomer extends Customer {
    @Override
    double getDiscount() {
        return 10; // 10% discount
    }
}

public class Tutorial2 {
    public static void main(String[] args) {
        Customer c1 = new RegularCustomer();
        Customer c2 = new PremiumCustomer();

        System.out.println("Regular Customer Discount: " + c1.getDiscount() + "%");
        System.out.println("Premium Customer Discount: " + c2.getDiscount() + "%");
    }
}

