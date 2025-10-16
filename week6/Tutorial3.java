package Week6;

// Tutorial3.java
/*
Scenario:
- Base class Employee has method calculateSalary().
- Manager and Developer override calculateSalary() differently.
*/

class Employee {
    double baseSalary;

    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus;

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    double overtime;

    @Override
    double calculateSalary() {
        return baseSalary + overtime;
    }
}

public class Tutorial3 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.baseSalary = 50000;
        m.bonus = 10000;

        Developer d = new Developer();
        d.baseSalary = 40000;
        d.overtime = 5000;

        System.out.println("Manager Salary: ₹" + m.calculateSalary());
        System.out.println("Developer Salary: ₹" + d.calculateSalary());
    }
}
