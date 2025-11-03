package performance;

import personal.Composer;
import personal.Director;

public class MusicalShow extends Show {

    private final Composer composer;
    private final String librettoText;

    public MusicalShow(String title, Integer duration, Director director, Composer composer, String librettoText) {
        super(title, duration, director);
        this.composer = composer;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

    public Composer getComposer() {
        return composer;
    }
}
