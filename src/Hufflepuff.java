public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int sorcery, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, sorcery, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
}
