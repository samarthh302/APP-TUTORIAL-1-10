package Week6;

// Tutorial5.java
/*
Scenario:
- Base class Admission has method admissionProcess().
- UndergraduateAdmission and PostgraduateAdmission override the method with their specific processes.
*/

class Admission {
    void admissionProcess() {
        System.out.println("General Admission Process");
    }
}

class UndergraduateAdmission extends Admission {
    @Override
    void admissionProcess() {
        System.out.println("Merit + Entrance Test");
    }
}

class PostgraduateAdmission extends Admission {
    @Override
    void admissionProcess() {
        System.out.println("Written Test + Interview");
    }
}

public class Tutorial5 {
    public static void main(String[] args) {
        Admission ug = new UndergraduateAdmission();
        Admission pg = new PostgraduateAdmission();

        ug.admissionProcess();
        pg.admissionProcess();
    }
}
