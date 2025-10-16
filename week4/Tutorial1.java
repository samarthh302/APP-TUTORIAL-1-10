package Week4;

// Tutorial1.java
class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double getAverage() {
        int sum = 0;
        for (int m : marks) sum += m;
        return (double) sum / marks.length;
    }
}

public class Tutorial1 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice", new int[]{80, 85, 90}),
            new Student("Bob", new int[]{70, 75, 72}),
            new Student("Charlie", new int[]{88, 92, 95})
        };

        Student top = students[0];
        for (Student s : students) {
            if (s.getAverage() > top.getAverage())
                top = s;
        }

        System.out.println("Top Student: " + top.name);
        System.out.println("Average Marks: " + top.getAverage());
    }
}

