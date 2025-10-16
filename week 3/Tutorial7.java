package Week3;

// Tutorial7.java
class Car {
    String brand;
    String model;
    int year;

    void start() {
        System.out.println(brand + " " + model + " (" + year + ") is starting...");
    }
}

public class Tutorial7 {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.model = "Innova";
        c.year = 2022;

        c.start();
    }
}


