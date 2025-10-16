package Week4;

// Tutorial4.java
class Movie {
    String title;
    int[] ratings;

    Movie(String title, int[] ratings) {
        this.title = title;
        this.ratings = ratings;
    }

    double averageRating() {
        int sum = 0;
        for (int r : ratings) sum += r;
        return (double) sum / ratings.length;
    }
}

public class Tutorial4 {
    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("Inception", new int[]{5, 4, 5, 4, 5}),
            new Movie("Avatar", new int[]{4, 4, 4, 3, 4}),
            new Movie("Interstellar", new int[]{5, 5, 5, 5, 4}),
            new Movie("Titanic", new int[]{4, 5, 4, 4, 5})
        };

        Movie best = movies[0];
        for (Movie m : movies) {
            if (m.averageRating() > best.averageRating())
                best = m;
        }

        System.out.println("Best Movie: " + best.title);
        System.out.println("Average Rating: " + best.averageRating());
    }
}

