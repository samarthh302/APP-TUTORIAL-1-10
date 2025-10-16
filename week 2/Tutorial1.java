package Week2;

public class Tutorial1 {
    public static void main(String[] args) {
        System.out.println("Seats that are every 4th seat in the bus (1–100):");

        for (int seat = 4; seat <= 100; seat += 4) {
            System.out.print(seat + " ");
        }
    }
}
