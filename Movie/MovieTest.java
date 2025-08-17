interface Streamable {
    void play();
    void pause();
}

abstract class Movie implements Streamable {
    protected String title;
    protected int releaseYear;
    protected int boxOfficeColle;

    public Movie(String title, int releaseYear, int boxOfficeColle) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.boxOfficeColle = boxOfficeColle;
    }

    public abstract void review();
}

class SuperheroMovie extends Movie {
    private String genre;

    public SuperheroMovie(String title, int releaseYear, int boxOfficeColle, String genre) {
        super(title, releaseYear, boxOfficeColle);
        this.genre = genre;
    }

    public void heroSavedEarth() {
        System.out.println(title + " - The hero saved Earth!");
    }

    @Override
    public void play() {
        System.out.println("Playing superhero movie: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused superhero movie: " + title);
    }

    @Override
    public void review() {
        System.out.println("Reviewing superhero movie: " + title + " [" + genre + "]");
    }
}

class Biography extends Movie {
    private String protagonist;

    public Biography(String title, int releaseYear, int boxOfficeColle, String protagonist) {
        super(title, releaseYear, boxOfficeColle);
        this.protagonist = protagonist;
    }

    public String getProtagonist() {
        return protagonist;
    }

    public void setProtagonist(String protagonist) {
        this.protagonist = protagonist;
    }

    public void happyEnding() {
        System.out.println("Biography of " + protagonist + " has a happy ending!");
    }

    @Override
    public void play() {
        System.out.println("Playing biography movie: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused biography movie: " + title);
    }

    @Override
    public void review() {
        System.out.println("Reviewing biography of " + protagonist + ": " + title);
    }
}

public class MovieTest {
    public static void main(String[] args) {
        SuperheroMovie s1 = new SuperheroMovie("Siccin 4", 2017, 5000000, "Horror");
        s1.play();
        s1.review();
        s1.heroSavedEarth();
        s1.pause();

        System.out.println();

        SuperheroMovie sm = new SuperheroMovie("Avengers: Endgame", 2019, 2000000000, "Action");
        sm.play();
        sm.review();
        sm.heroSavedEarth();
        sm.pause();

        System.out.println();

        Biography bio = new Biography("The Social Network", 2010, 96000000, "Mark Zuckerberg");
        bio.play();
        bio.review();
        bio.happyEnding();
        bio.setProtagonist("Mark Elliot Zuckerberg");
        System.out.println("Updated protagonist: " + bio.getProtagonist());
        bio.pause();
    }
}
