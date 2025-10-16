package Week3;
// Tutorial4.java
class Movie {
    String title;
    String genre;
    double rating;

    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/10");
        System.out.println();
    }
}

public class Tutorial4 {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "Inception";
        m.genre = "Science Fiction";
        m.rating = 8.8;

        m.showDetails();
    }
}
