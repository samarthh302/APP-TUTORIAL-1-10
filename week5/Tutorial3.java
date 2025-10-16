package Week5;
// Tutorial3.java
/*
Inheritance & Reusability:
- Create a base class Vehicle with common properties: speed, fuelCapacity, start().
- Subclasses Car, Bike, Truck inherit Vehicle and can add their own features.
*/

class Vehicle {
    String brand;
    int speed;
    int fuelCapacity;

    void start() {
        System.out.println(brand + " vehicle is starting...");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    void showCarInfo() {
        System.out.println("Car Brand: " + brand + ", Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasCarrier;

    void showBikeInfo() {
        System.out.println("Bike Brand: " + brand + ", Has Carrier: " + hasCarrier);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    void showTruckInfo() {
        System.out.println("Truck Brand: " + brand + ", Load Capacity: " + loadCapacity + "kg");
    }
}

public class Tutorial3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.speed = 180;
        c.fuelCapacity = 50;
        c.numberOfDoors = 4;
        c.start();
        c.showCarInfo();

        Bike b = new Bike();
        b.brand = "Honda";
        b.speed = 100;
        b.fuelCapacity = 15;
        b.hasCarrier = true;
        b.start();
        b.showBikeInfo();
    }
}
