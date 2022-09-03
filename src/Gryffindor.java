public class Gryffindor extends Hogwarts {

    private int nobleness;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int sorcery, int transgression, int nobleness, int honor, int bravery) {
        super(name, sorcery, transgression);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }
}
