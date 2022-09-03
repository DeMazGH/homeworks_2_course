public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 11, 11, 11, 11, 11),
                new Gryffindor("Hermione Granger", 12, 12, 12, 12, 12),
                new Gryffindor("Ron Weasley", 13, 13, 13, 13, 13)
        };

        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 21, 21, 21, 21, 21, 21, 21),
                new Slytherin("Graham Montagu", 22, 22, 22, 22, 22, 22, 22),
                new Slytherin("Gregory Goyle", 23, 23, 23, 23, 23, 23, 23)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zacharias Smith", 31, 31, 31, 31, 31),
                new Hufflepuff("Cedric Diggory", 32, 32, 32, 32, 32),
                new Hufflepuff("Justin Finch-Fletchley", 33, 33, 33, 33, 33)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Czhou Chang", 41, 41, 41, 41, 41, 41),
                new Ravenclaw("Padma Patil", 42, 42, 42, 42, 42, 42),
                new Ravenclaw("Marcus Belby", 43, 43, 43, 43, 43, 43)
        };

        gryffindors[0].printStudentDescription(gryffindors[0]);
        slytherins[0].printStudentDescription(slytherins[0]);
        ravenclaws[0].printStudentDescription(ravenclaws[0]);
        hufflepuffs[0].printStudentDescription(hufflepuffs[0]);

        gryffindors[0].printStudentComparison(gryffindors[0], gryffindors[2]);
        slytherins[0].printStudentComparison(slytherins[0], slytherins[1]);
    }
}