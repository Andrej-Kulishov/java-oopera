package personal;

import java.util.Objects;

public class Actor extends Person {

    private final Integer height;

    public Actor(String name, String surname, Gender gender, Integer height) {
        super(name, surname, gender);
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Actor: " + super.toString() + "(" + height + ").";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Actor actor = (Actor) o;
        return Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(height);
        return result;
    }
}
