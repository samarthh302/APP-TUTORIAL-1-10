package Week10;

// Tutorial2.java
/*
Scenario:
- Filter students based on criteria using Predicate functional interface.
*/

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tutorial2 {
    public static void main(String[] args) {
        List<Map<String, Object>> students = new ArrayList<>();
        students.add(Map.of("name","Alice","cgpa",9.0));
        students.add(Map.of("name","Bob","cgpa",7.5));
        students.add(Map.of("name","Charlie","cgpa",8.5));

        // Higher-order function to filter students
        List<Map<String,Object>> highCgpa = filterStudents(s -> (double)s.get("cgpa") > 8, students);
        System.out.println(highCgpa);
    }

    public static List<Map<String,Object>> filterStudents(Predicate<Map<String,Object>> criteria,
                                                           List<Map<String,Object>> students) {
        return students.stream().filter(criteria).collect(Collectors.toList());
    }
}
