public class Slytherin extends Hogwarts {

    private int cunning;
    private int decisiveness;
    private int ambitiousness;
    private int resourcefulness;
    private int powerLust;

    public Slytherin(String name, int sorcery, int transgression, int cunning, int decisiveness,
                     int ambitiousness, int resourcefulness, int powerLust) {
        super(name, sorcery, transgression);
        if (sorcery < 0 || sorcery > 100 || transgression < 0 || transgression > 100 || cunning < 0 || cunning > 100 ||
                decisiveness < 0 || decisiveness > 100 || ambitiousness < 0 || ambitiousness > 100 ||
                resourcefulness < 0 || resourcefulness > 100 || powerLust < 0 || powerLust > 100) {
            throw new IllegalArgumentException("Параметры могут быть от 0 до 100");
        }
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
            System.out.println(firstStudent.getFullName() + " лучший Слизеринец чем " + secondStudent.getFullName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getFullName() + " лучший Слизеринец чем " + firstStudent.getFullName());
        } else {
            System.out.println(secondStudent.getFullName() + " и " + firstStudent.getFullName() + " одинаково хороши");
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

    public void setCunning(int cunning) {
        if (cunning < 0 || cunning > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.cunning = cunning;
    }

    public void setDecisiveness(int decisiveness) {
        if (decisiveness < 0 || decisiveness > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.decisiveness = decisiveness;
    }

    public void setAmbitiousness(int ambitiousness) {
        if (ambitiousness < 0 || ambitiousness > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.ambitiousness = ambitiousness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.resourcefulness = resourcefulness;
    }

    public void setPowerLust(int powerLust) {
        if (powerLust < 0 || powerLust > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.powerLust = powerLust;
    }
}
