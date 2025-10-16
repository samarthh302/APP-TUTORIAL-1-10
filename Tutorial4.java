package Week10;

// Tutorial4.java
/*
Scenario:
- studentProfile returns an inner class object that stores marks and calculates average.
- Demonstrates closure-like behavior in Java using inner classes.
*/

import java.util.*;

public class Tutorial4 {
    public static void main(String[] args) {
        StudentProfile alice = studentProfile("Alice");
        alice.addMarks("Math", 90);
        alice.addMarks("Science", 85);
    }

    // Factory method returning inner class
    public static StudentProfile studentProfile(String name) {
        class Profile implements StudentProfile {
            Map<String,Integer> marks = new HashMap<>();

            public void addMarks(String subject, int mark) {
                marks.put(subject, mark);
                double avg = marks.values().stream().mapToInt(Integer::intValue).average().orElse(0);
                System.out.println(name + "'s Marks: " + marks + ", Average: " + avg);
            }
        }
        return new Profile();
    }

    interface StudentProfile {
        void addMarks(String subject, int mark);
    }
}
