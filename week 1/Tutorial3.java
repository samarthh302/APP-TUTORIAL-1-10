package Week1;

import java.util.Scanner;

public class Tutorial3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3.");
        }

        sc.close();
    }
}
