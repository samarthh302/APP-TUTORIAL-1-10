package Week10;

// Tutorial1.java
/*
Scenario:
- Use a functional interface to pass different bonus functions.
- applyBonus takes a function and applies it to salary.
*/

import java.util.function.Function;

public class Tutorial1 {
    // Example bonus functions
    static Function<Integer, Integer> festivalBonus = salary -> salary + 5000;
    static Function<Integer, Integer> performanceBonus = salary -> salary + 10000;

    // Higher-order function
    public static int applyBonus(Function<Integer, Integer> bonusFunc, int salary) {
        return bonusFunc.apply(salary);
    }

    public static void main(String[] args) {
        int updatedSalary = applyBonus(performanceBonus, 50000);
        System.out.println("Updated Salary: " + updatedSalary); // 60000
    }
}
