package Week4;

// Tutorial6.java
class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double average() {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }
}

class Department {
    String departmentName;
    Student[] students;

    Department(String departmentName, Student[] students) {
        this.departmentName = departmentName;
        this.students = students;
    }

    double departmentAverage() {
        double sum = 0;
        for (Student s : students) sum += s.average();
        return sum / students.length;
    }
}

public class Tutorial6 {
    public static void main(String[] args) {
        Department[] departments = {
            new Department("CSE", new Student[]{
                new Student("A", new int[]{80, 85, 90}),
                new Student("B", new int[]{78, 82, 88})
            }),
            new Department("ECE", new Student[]{
                new Student("C", new int[]{70, 72, 74}),
                new Student("D", new int[]{68, 70, 73})
            }),
            new Department("IT", new Student[]{
                new Student("E", new int[]{88, 90, 92}),
                new Student("F", new int[]{85, 87, 89})
            })
        };

        Department top = departments[0];
        for (Department d : departments) {
            if (d.departmentAverage() > top.departmentAverage())
                top = d;
        }

        System.out.println("Top Department: " + top.departmentName);
        System.out.println("Average Marks: " + top.departmentAverage());
    }
}

