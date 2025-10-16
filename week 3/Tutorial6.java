package Week3;
// Tutorial6.java
class Book {
    String title;
    String author;
    double price;

    double discountedPrice(double discountPercent) {
        return price - (price * discountPercent / 100);
    }
}

public class Tutorial6 {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "The Alchemist";
        b.author = "Paulo Coelho";
        b.price = 500;

        double finalPrice = b.discountedPrice(10); // 10% discount

        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Original Price: ₹" + b.price);
        System.out.println("Price after 10% discount: ₹" + finalPrice);
    }
}
