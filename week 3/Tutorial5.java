package Week3;
// Tutorial5.java
class Student {
    int rollNo;
    String name;
    double marks;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class Tutorial5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Paras";
        s1.marks = 89.5;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Tanmay";
        s2.marks = 92.0;

        s1.display();
        s2.display();
    }
}
