package Week1;
import java.util.Scanner;

public class Tutorial4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();  // Read the entire line

        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");

        System.out.println("\nEach word on a new line:");
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
