package Week7;

// Tutorial3.java
/*
Scenario:
- One thread prints multiplication table of 5.
- Another thread prints multiplication table of 10.
- Demonstrates concurrent execution.
*/

class Table5Thread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

class Table10Thread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("10 x " + i + " = " + (10 * i));
        }
    }
}

public class Tutorial3 {
    public static void main(String[] args) {
        Table5Thread t5 = new Table5Thread();
        Table10Thread t10 = new Table10Thread();

        t5.start();
        t10.start();
    }
}

