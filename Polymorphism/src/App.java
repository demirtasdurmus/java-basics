import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Movie theMovie = new Movie("Horror");
        // theMovie.watchMovie();

        // Adventure theAdventure = new Adventure("Saw");
        // theAdventure.watchMovie();

        // Movie theMovie = Movie.getMovie("ScienceFiction", "Star Wars");
        // theMovie.watchMovie();

        Scanner s = new Scanner(System.in);

        while (true) {
            System.err.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                s.close();
                break;
            }

            System.err.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
