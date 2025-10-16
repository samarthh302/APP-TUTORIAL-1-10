package Week3;

// Tutorial1.java
class Employee {
    String name;
    int id;
    double salary;

    void showDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class Tutorial1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Alice";
        e1.salary = 50000;

        Employee e2 = new Employee();
        e2.id = 102;
        e2.name = "Bob";
        e2.salary = 60000;

        e1.showDetails();
        e2.showDetails();
    }
}
