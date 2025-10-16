package Week3;

// Tutorial2.java
class Mobile {
    String brand;
    String model;
    double price;

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }
}

public class Tutorial2 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.model = "Galaxy S24";
        m1.price = 90000;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.model = "iPhone 15";
        m2.price = 120000;

        Mobile m3 = new Mobile();
        m3.brand = "OnePlus";
        m3.model = "12R";
        m3.price = 45000;

        m1.showDetails();
        m2.showDetails();
        m3.showDetails();
    }
}
