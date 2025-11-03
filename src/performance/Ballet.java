package performance;

import personal.Choreographer;
import personal.Composer;
import personal.Director;

public class Ballet extends MusicalShow {

    private Choreographer choreographer;

    public Ballet(String title, Integer duration, Director director, Composer composer, String librettoText,
                  Choreographer choreographer) {
        super(title, duration, director, composer, librettoText);
        this.choreographer = choreographer;
    }

    public Choreographer getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Choreographer choreographer) {
        this.choreographer = choreographer;
    }
}
