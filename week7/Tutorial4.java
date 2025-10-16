package Week7;
// Tutorial4.java
/*
Scenario:
- One thread displays "Hello" 5 times.
- Another thread displays "Welcome" 5 times.
- Demonstrates multi-threading with string output.
*/

class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}

class WelcomeThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome");
        }
    }
}

public class Tutorial4 {
    public static void main(String[] args) {
        HelloThread h = new HelloThread();
        WelcomeThread w = new WelcomeThread();

        h.start();
        w.start();
    }
}
