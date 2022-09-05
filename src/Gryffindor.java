public class Gryffindor extends Hogwarts {

    private int nobleness;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int sorcery, int transgression, int nobleness, int honor, int bravery) {
        super(name, sorcery, transgression);
        if (sorcery < 0 || sorcery > 100 || transgression < 0 || transgression > 100 || nobleness < 0 || nobleness > 100 ||
                honor < 0 || honor > 100 || bravery < 0 || bravery > 100) {
            throw new IllegalArgumentException("Параметры могут быть от 0 до 100");
        }
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

    public void setNobleness(int nobleness) {
        if (nobleness < 0 || nobleness > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.nobleness = nobleness;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.bravery = bravery;
    }
}
