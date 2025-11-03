package personal;

public class Director extends Person {
    private Integer numberOfShows;

    public Director(String name, String surname, Gender gender, Integer numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public Integer getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(Integer numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director: " + getName() + " " + getSurname() + ".";
    }
}
