package Week4;

// Tutorial2.java
class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Tutorial2 {
    static void printBooksByAuthor(Book[] books, String author) {
        System.out.println("Books by " + author + ":");
        for (Book b : books) {
            if (b.author.equalsIgnoreCase(author))
                System.out.println("- " + b.title);
        }
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("The Alchemist", "Paulo Coelho"),
            new Book("Eleven Minutes", "Paulo Coelho"),
            new Book("Wings of Fire", "A.P.J. Abdul Kalam"),
            new Book("1984", "George Orwell"),
            new Book("Animal Farm", "George Orwell")
        };

        printBooksByAuthor(books, "Paulo Coelho");
    }
}

