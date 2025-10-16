package Week4;
// Tutorial3.java
class Employee {
    int id;
    String name;
    double[] monthlySalaries;

    Employee(int id, String name, double[] monthlySalaries) {
        this.id = id;
        this.name = name;
        this.monthlySalaries = monthlySalaries;
    }

    double totalSalary() {
        double sum = 0;
        for (double s : monthlySalaries) sum += s;
        return sum;
    }
}

public class Tutorial3 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "John", new double[]{30000, 32000, 31000, 33000, 34000, 35000}),
            new Employee(2, "Jane", new double[]{40000, 42000, 41000, 43000, 44000, 45000}),
            new Employee(3, "Mark", new double[]{35000, 36000, 37000, 38000, 39000, 40000})
        };

        Employee top = employees[0];
        for (Employee e : employees) {
            if (e.totalSalary() > top.totalSalary())
                top = e;
        }

        System.out.println("Employee with highest total salary: " + top.name);
        System.out.println("Total in 6 months: ₹" + top.totalSalary());
    }
}
