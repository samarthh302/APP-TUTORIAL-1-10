package Week10;
// Tutorial5.java
/*
Scenario:
- discountCalculator returns a function that applies discount to any price.
- Demonstrates closures using lambda in Java.
*/

import java.util.function.Function;

public class Tutorial5 {
    public static void main(String[] args) {
        Function<Double, Double> tenPercent = discountCalculator(0.1);
        System.out.println("Discounted Price: " + tenPercent.apply(2000.0)); // 1800.0
    }

    public static Function<Double, Double> discountCalculator(double rate) {
        return price -> price * (1 - rate);
    }
}
