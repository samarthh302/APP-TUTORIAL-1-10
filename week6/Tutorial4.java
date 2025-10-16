package Week6;
// Tutorial4.java
/*
Scenario:
- Base class Shape has method area().
- Circle and Rectangle override area() to calculate their areas.
*/

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    @Override
    double area() {
        return length * width;
    }
}

public class Tutorial4 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7;
        System.out.println("Circle Area: " + c.area());

        Rectangle r = new Rectangle();
        r.length = 5;
        r.width = 10;
        System.out.println("Rectangle Area: " + r.area());
    }
}
