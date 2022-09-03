public class Slytherin extends Hogwarts {

    private int cunning;
    private int decisiveness;
    private int ambitiousness;
    private int resourcefulness;
    private int powerLust;

    public Slytherin(String name, int sorcery, int transgression, int cunning, int decisiveness,
                     int ambitiousness, int resourcefulness, int powerLust) {
        super(name, sorcery, transgression);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }
}
