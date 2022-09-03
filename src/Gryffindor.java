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

    public void printStudentComparison(Gryffindor firstStudent, Gryffindor secondStudent) {
        if (firstStudent == secondStudent) {
            System.out.println("Нельзя сравнить одного и того же студента");
            return;
        }
        int firstStudentProperties = firstStudent.nobleness + firstStudent.honor + firstStudent.bravery;
        int secondStudentProperties = secondStudent.nobleness + secondStudent.honor + secondStudent.bravery;
        if (firstStudentProperties > secondStudentProperties) {
            System.out.println(firstStudent.getName() + " лучший Гриффиндорец чем " + secondStudent.getName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getName() + " лучший Гриффиндорец чем " + firstStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хороши");
        }
    }

    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
