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

    public void printStudentComparison(Slytherin firstStudent, Slytherin secondStudent) {
        if (firstStudent == secondStudent) {
            System.out.println("Нельзя сравнить одного и того же студента");
            return;
        }
        int firstStudentProperties = firstStudent.cunning + firstStudent.decisiveness + firstStudent.ambitiousness +
                firstStudent.resourcefulness + firstStudent.powerLust;
        int secondStudentProperties = secondStudent.cunning + secondStudent.decisiveness + secondStudent.ambitiousness +
                secondStudent.resourcefulness + secondStudent.powerLust;
        if (firstStudentProperties > secondStudentProperties) {
            System.out.println(firstStudent.getName() + " лучший Слизеринец чем " + secondStudent.getName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getName() + " лучший Слизеринец чем " + firstStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хороши");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }
}
