package Week5;



// Tutorial2.java
/*
Encapsulation:
- Marks are private and cannot be accessed directly.
- Teachers can update marks via a public setter method.
- Students can view marks via a public getter method.
*/

class Student {
    private String name;
    private int[] marks;

    Student(String name, int numSubjects) {
        this.name = name;
        marks = new int[numSubjects];
    }

    // Only teacher can update marks
    public void setMarks(int subjectIndex, int mark) {
        if (subjectIndex >= 0 && subjectIndex < marks.length)
            marks[subjectIndex] = mark;
    }

    // Students can only view marks
    public int getMarks(int subjectIndex) {
        if (subjectIndex >= 0 && subjectIndex < marks.length)
            return marks[subjectIndex];
        return -1;
    }

    public String getName() {
        return name;
    }
}

public class Tutorial2 {
    public static void main(String[] args) {
        Student s = new Student("Alice", 3);

        // Teacher updates marks
        s.setMarks(0, 85);
        s.setMarks(1, 90);
        s.setMarks(2, 78);

        // Student views marks
        System.out.println(s.getName() + "'s Marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + s.getMarks(i));
        }
    }
}
