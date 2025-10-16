package Week1;

public class Tutorial5 {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("Initial value of x: " + x);

        // Post-increment: value is used first, then incremented
        System.out.println("Post-increment (x++): " + (x++));
        System.out.println("Value of x after post-increment: " + x);

        // Pre-increment: value is incremented first, then used
        System.out.println("Pre-increment (++x): " + (++x));
        System.out.println("Value of x after pre-increment: " + x);
    }
}
