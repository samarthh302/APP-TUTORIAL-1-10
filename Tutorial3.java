package Week10;

// Tutorial3.java
/*
Scenario:
- Pass different math operations as lambda expressions.
- operate can perform add, sub, mul, div without modifying the method.
*/

import java.util.function.BiFunction;

public class Tutorial3 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
        BiFunction<Integer,Integer,Integer> mul = (a,b) -> a*b;

        System.out.println("Add: " + operate(add, 10, 5)); // 15
        System.out.println("Multiply: " + operate(mul, 6, 7)); // 42
    }

    public static int operate(BiFunction<Integer,Integer,Integer> func, int a, int b) {
        return func.apply(a,b);
    }
}
