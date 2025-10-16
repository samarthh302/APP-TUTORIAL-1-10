package Week7;
// Tutorial2.java
/*
Scenario:
- One thread prints even numbers, another prints odd numbers.
- Demonstrates running multiple threads simultaneously.
*/

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class Tutorial2 {
    public static void main(String[] args) {
        EvenThread et = new EvenThread();
        OddThread ot = new OddThread();

        et.start();
        ot.start();
    }
}

