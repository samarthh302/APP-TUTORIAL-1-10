package Week2;
public class Tutorial3 {
    public static void main(String[] args) {
        int containerCapacity = 80;
        int bottle10 = 10;
        int bottle3 = 3;

        int used10 = containerCapacity / bottle10;  // use 10L bottles first
        int remaining = containerCapacity % bottle10; // leftover after 10L bottles
        int used3 = 0;

        if (remaining > 0) {
            used3 = remaining / bottle3;
            if (remaining % bottle3 != 0) {
                used3++; // one extra 3L bottle if not perfectly divisible
            }
        }

        System.out.println("Container capacity: " + containerCapacity + "L");
        System.out.println("10L bottles used: " + used10);
        System.out.println("3L bottles used: " + used3);
    }
}

