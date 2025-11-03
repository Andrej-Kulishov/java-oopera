import performance.Ballet;
import performance.MusicalShow;
import performance.Opera;
import personal.Actor;
import personal.Choreographer;
import personal.Composer;
import personal.Director;
import personal.Gender;

public class Theatre {

    public static void main(String[] args) {
        Actor actorDimaPetrov = new Actor("Dima", "Petrov", Gender.MALE, 190);
        Actor actorAndreiAndreev = new Actor("Andrei", "Andreev", Gender.MALE, 195);
        Actor actorLizaNikeeva = new Actor("Liza", "Nikeeva", Gender.FEMALE, 170);

        Director directorIvanIvanov = new Director("Ivan", "Ivanov", Gender.MALE, 2);
        Director directorInnaPolujan = new Director("Inna", "Polujan", Gender.FEMALE, 1);

        MusicalShow musicalShowRomeo = new MusicalShow("Romeo", 60, directorIvanIvanov,
                new Composer("Romuald", "Smith", Gender.MALE),
                """
                        Music flows, masks shimmer.
                        Young Juliet steps into the light.
                        Romeo, holding his breath, sees her —
                        and time stands still.
                        """);

        Opera operaPoseidon = new Opera("Poseidon", 90, directorIvanIvanov,
                new Composer("Filip", "Maximus", Gender.MALE),
                """
                        Deep beneath the silver sea, he reigns in thunder’s might,
                        The waves obey his trident’s call, the storms awake in light.
                        Yet in his heart, a mortal love begins to rise and burn,
                        And from the depths, the god must choose — to rule or to return
                        """, 20);

        Ballet balletBlackAndWhite = new Ballet("Black and White", 120, directorInnaPolujan,
                new Composer("Genevra", "Johns", Gender.FEMALE),
                """
                        Shadows dance where light retreats,
                        Silent hearts in rhythmic beats.
                        Opposites collide, then blend,
                        A timeless waltz that has no end.
                        """, new Choreographer("Ben", "Viego", Gender.MALE));

        musicalShowRomeo.addActor(actorDimaPetrov);
        musicalShowRomeo.addActor(actorAndreiAndreev);
        musicalShowRomeo.addActor(actorLizaNikeeva);

        operaPoseidon.addActor(actorDimaPetrov);
        operaPoseidon.addActor(actorAndreiAndreev);

        balletBlackAndWhite.addActor(actorDimaPetrov);
        balletBlackAndWhite.addActor(actorLizaNikeeva);

        musicalShowRomeo.printActors();
        operaPoseidon.printActors();
        balletBlackAndWhite.printActors();

        balletBlackAndWhite.changeActor(actorAndreiAndreev, actorLizaNikeeva.getSurname());
        balletBlackAndWhite.printActors();

        operaPoseidon.changeActor(actorLizaNikeeva, "Rurikov");
        System.out.println("-".repeat(10));

        operaPoseidon.printLibrettoText();
        balletBlackAndWhite.printLibrettoText();
    }
}
