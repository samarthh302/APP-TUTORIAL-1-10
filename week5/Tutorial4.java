package Week5;

// Tutorial4.java
/*
Inheritance & Extension:
- Base class Patient has common details: name, age.
- InPatient extends Patient with extra property roomNumber.
- OutPatient inherits Patient without extra features.
*/

class Patient {
    String name;
    int age;

    void showDetails() {
        System.out.println("Patient Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient {
    int roomNumber;

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Room Number: " + roomNumber);
    }
}

class OutPatient extends Patient {
    // No extra properties, inherits everything from Patient
}

public class Tutorial4 {
    public static void main(String[] args) {
        InPatient ip = new InPatient();
        ip.name = "John";
        ip.age = 45;
        ip.roomNumber = 101;
        ip.showDetails();

        OutPatient op = new OutPatient();
        op.name = "Alice";
        op.age = 30;
        op.showDetails();
    }
}
