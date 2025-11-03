package performance;

import personal.Composer;
import personal.Director;

public class Opera extends MusicalShow {

    private final Integer choirSize;

    public Opera(String title, Integer duration, Director director, Composer composer, String librettoText,
                 Integer choirSize) {
        super(title, duration, director, composer, librettoText);
        this.choirSize = choirSize;
    }

    public Integer getChoirSize() {
        return choirSize;
    }
}
