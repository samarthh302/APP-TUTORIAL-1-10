package Week7;

// Tutorial1.java
/*
Scenario:
- Create a thread that prints numbers from 1 to 10.
- Demonstrates basic thread creation using Thread class.
*/

class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class Tutorial1 {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start(); // starts the thread and calls run()
    }
}

