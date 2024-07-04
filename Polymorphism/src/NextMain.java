public class NextMain {
  public static void main(String[] args) {
    /**
     * This won't compile without casting
     * If we use casting and pass a wrong type, it will cause a runtime exception
     */
    Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
    jaws.watchMovie();

    Object comedy = Movie.getMovie("C", "Airplane");
    // comedy.watchMovie(); // won't compile
    // comedy.watchComedy() // wont't compile either
    Comedy comedyMovie = (Comedy) comedy;
    comedyMovie.watchComedy();

    // type inference swith var keyword
    var airplane = Movie.getMovie("C", "Airplane");
    airplane.watchMovie();

    // using instance of
    Object unknowObj = Movie.getMovie("C", "Airplace");
    if (unknowObj instanceof Adventure) {
      ((Adventure) unknowObj).watchAdventure();
    } else if (unknowObj instanceof Comedy) {
      ((Comedy) unknowObj).watchComedy();
      // another syntax to get rid of casting
    } else if (unknowObj instanceof ScienceFiction syfy) {
      syfy.watchScienceFiction();
    } else {
      ((Movie) unknowObj).watchMovie();
    }
  }
}
