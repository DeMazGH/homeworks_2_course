public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry Potter", 11, 11, 11, 11, 11);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 12, 12, 12, 12, 12);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 13, 13, 13, 13, 13);


        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 21, 21, 21, 21, 21, 21, 21);
        Slytherin grahamMotagu = new Slytherin("Graham Montagu", 22, 22, 22, 22, 22, 22, 22);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 23, 23, 23, 23, 23, 23, 23);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 31, 31, 31, 31, 31);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 32, 32, 32, 32, 32);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 33, 33, 33, 33, 33);

        Ravenclaw czhouChang = new Ravenclaw("Czhou Chang", 41, 41, 41, 41, 41, 41);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 42, 42, 42, 42, 42, 42);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 43, 43, 43, 43, 43, 43);

        harryPotter.printStudentDescription(hermioneGranger);
        dracoMalfoy.printStudentDescription(dracoMalfoy);
        cedricDiggory.printStudentDescription(cedricDiggory);
        czhouChang.printStudentDescription(czhouChang);

        ronWeasley.printStudentComparison(ronWeasley, ronWeasley);
        gregoryGoyle.printStudentComparison(gregoryGoyle, grahamMotagu);
        zachariasSmith.printStudentComparison(justinFinchFletchley, cedricDiggory);
        czhouChang.printStudentComparison(padmaPatil, marcusBelby);
        Hogwarts.printStudentComparison(harryPotter, dracoMalfoy);
    }
}