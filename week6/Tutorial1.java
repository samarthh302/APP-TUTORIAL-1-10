package Week6;

// Tutorial1.java
/*
Scenario:
- Base class Vehicle has method speed().
- Subclasses Car and Bike override speed() to show specific speeds.
*/

class Vehicle {
    void speed() {
        System.out.println("Generic Vehicle Speed");
    }
}

class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 100 km/h");
    }
}

class Bike extends Vehicle {
    @Override
    void speed() {
        System.out.println("Bike runs at 80 km/h");
    }
}

public class Tutorial1 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.speed(); // calls Car's overridden method
        v2.speed(); // calls Bike's overridden method
    }
}

