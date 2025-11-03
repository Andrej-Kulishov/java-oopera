package performance;

import personal.Actor;
import personal.Director;

import java.util.ArrayList;

public abstract class Show {
    protected final String title;
    protected final Integer duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, Integer duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println(actor + "\b is already performing in the play.");
        } else {
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor newActor, String surnameOldActor) {
        Actor deleteActor = null;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surnameOldActor)) {
                deleteActor = actor;
            }
        }
        if (deleteActor != null) {
            listOfActors.remove(deleteActor);
            listOfActors.add(newActor);
            return;
        }
        System.out.println("There is no such actor on the list. A replacement is not possible.");
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public Integer getDuration() {
        return duration;
    }

    public void printActors() {
        System.out.println(this.getTitle());
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println("-".repeat(10));
    }
}
