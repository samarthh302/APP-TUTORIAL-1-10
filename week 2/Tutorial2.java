package Week2;

public class Tutorial2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {  // skip numbers divisible by 5
                sum += i;
            }
        }

        System.out.println("Sum of numbers from 1 to 100 (excluding multiples of 5): " + sum);
    }
}
