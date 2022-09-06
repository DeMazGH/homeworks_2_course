public class Slytherin extends Hogwarts {

    private int cunning;
    private int decisiveness;
    private int ambitiousness;
    private int resourcefulness;
    private int powerLust;

    public Slytherin(String name, int sorcery, int transgression, int cunning, int decisiveness,
                     int ambitiousness, int resourcefulness, int powerLust) {
        super(name, sorcery, transgression);
        HogwartsService.checkParametrValue("cunning", cunning);
        HogwartsService.checkParametrValue("decisiveness", decisiveness);
        HogwartsService.checkParametrValue("ambitiousness", ambitiousness);
        HogwartsService.checkParametrValue("resourcefulness", resourcefulness);
        HogwartsService.checkParametrValue("powerLust", powerLust);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public void printStudentComparison(Slytherin firstStudent, Slytherin secondStudent) {
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

    public void printStudentDescription(Slytherin slytherinStudent) {
        System.out.println(slytherinStudent.getFullName() + " обладает качествами: ");
        System.out.println("Сила магии - " + slytherinStudent.getSorcery());
        System.out.println("Расстояние трансгрессии - " + slytherinStudent.getTransgression());
        System.out.println("Хитрость - " + slytherinStudent.getCunning());
        System.out.println("Решительность - " + slytherinStudent.getDecisiveness());
        System.out.println("Амбициозность - " + slytherinStudent.getAmbitiousness());
        System.out.println("Находчивость - " + slytherinStudent.getResourcefulness());
        System.out.println("Жажда власти - " + slytherinStudent.getPowerLust());
        System.out.println();
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
        HogwartsService.checkParametrValue("cunning", cunning);
        this.cunning = cunning;
    }

    public void setDecisiveness(int decisiveness) {
        HogwartsService.checkParametrValue("decisiveness", decisiveness);
        this.decisiveness = decisiveness;
    }

    public void setAmbitiousness(int ambitiousness) {
        HogwartsService.checkParametrValue("ambitiousness", ambitiousness);
        this.ambitiousness = ambitiousness;
    }

    public void setResourcefulness(int resourcefulness) {
        HogwartsService.checkParametrValue("resourcefulness", resourcefulness);
        this.resourcefulness = resourcefulness;
    }

    public void setPowerLust(int powerLust) {
        HogwartsService.checkParametrValue("powerLust", powerLust);
        this.powerLust = powerLust;
    }
}
