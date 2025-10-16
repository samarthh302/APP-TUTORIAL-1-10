package Week7;

// Tutorial5.java
/*
Scenario:
- Create a thread using Runnable interface.
- Prints squares of numbers from 1 to 5.
- Demonstrates using Runnable instead of extending Thread.
*/

class SquareRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " squared = " + (i * i));
        }
    }
}

public class Tutorial5 {
    public static void main(String[] args) {
        Thread t = new Thread(new SquareRunnable());
        t.start();
    }
}
