// Interface → Abstraction
interface Streamable {
    void play();   // must be implemented by all classes
    void pause();  // must be implemented by all classes
}

// Abstract Class → Abstraction + Inheritance
abstract class Movie implements Streamable {
    protected String title;
    protected int releaseYear;
    protected int boxOfficeColle;

    // Constructor
    public Movie(String title, int releaseYear, int boxOfficeColle) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.boxOfficeColle = boxOfficeColle;
    }

    // Abstract method → will be overridden (Polymorphism)
    public abstract void review();
}

// SuperheroMovie Class → Inheritance + Polymorphism
class SuperheroMovie extends Movie {
    private String genre;

    public SuperheroMovie(String title, int releaseYear, int boxOfficeColle, String genre) {
        super(title, releaseYear, boxOfficeColle);
        this.genre = genre;
    }

    // Extra behavior only for superhero movies
    public void heroSavedEarth() {
        System.out.println(title + " - The hero saved Earth!");
    }

    // Implementing interface methods
    @Override
    public void play() {
        System.out.println("Playing superhero movie: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused superhero movie: " + title);
    }

    // Overridden review method (Polymorphism)
    @Override
    public void review() {
        System.out.println("Reviewing superhero movie: " + title + " [" + genre + "]");
    }
}

// Biography Class → Inheritance + Encapsulation
class Biography extends Movie {
    private String protagonist; // Encapsulation: kept private

    public Biography(String title, int releaseYear, int boxOfficeColle, String protagonist) {
        super(title, releaseYear, boxOfficeColle);
        this.protagonist = protagonist;
    }

    // Getter & Setter → Encapsulation
    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }

    // Extra behavior only for biographies
    public void happyEnding() {
        System.out.println("Biography of " + protagonist + " has a happy ending!");
    }

    // Implementing interface methods
    @Override
    public void play() {
        System.out.println("Playing biography movie: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused biography movie: " + title);
    }

    // Overridden review method (Polymorphism)
    @Override
    public void review() {
        System.out.println("Reviewing biography of " + protagonist + ": " + title);
    }
}

// Main class → testing all movies
public class MovieTest {
    public static void main(String[] args) {
        // First movie → Siccin 4
        SuperheroMovie s1 = new SuperheroMovie("Siccin 4", 2017, 5000000, "Horror");
        s1.play();
        s1.review();
        s1.heroSavedEarth();
        s1.pause();

        System.out.println();

        // Second movie → Avengers: Endgame
        SuperheroMovie sm = new SuperheroMovie("Avengers: Endgame", 2019, 2000000000, "Action");
        sm.play();
        sm.review();
        sm.heroSavedEarth();
        sm.pause();

        System.out.println();

        // Third movie → The Social Network (Biography)
        Biography bio = new Biography("The Social Network", 2010, 96000000, "Mark Zuckerberg");
        bio.play();
        bio.review();
        bio.happyEnding();
        bio.setProtagonist("Mark Elliot Zuckerberg");
        System.out.println("Updated protagonist: " + bio.getProtagonist());
        bio.pause();
    }
}
