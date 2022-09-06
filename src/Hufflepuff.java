public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int sorcery, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, sorcery, transgression);
        HogwartsService.checkParametrValue("industriousness", industriousness);
        HogwartsService.checkParametrValue("loyalty", loyalty);
        HogwartsService.checkParametrValue("honesty", honesty);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void printStudentComparison(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int firstStudentProperties = firstStudent.industriousness + firstStudent.loyalty + firstStudent.honesty;
        int secondStudentProperties = secondStudent.industriousness + secondStudent.loyalty + secondStudent.honesty;
        if (firstStudentProperties > secondStudentProperties) {
            System.out.println(firstStudent.getFullName() + " лучший Пуффендуец чем " + secondStudent.getFullName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getFullName() + " лучший Пуффендуец чем " + firstStudent.getFullName());
        } else {
            System.out.println(secondStudent.getFullName() + " и " + firstStudent.getFullName() + " одинаково хороши");
        }
    }

    public void printStudentDescription(Hufflepuff hufflepuffStudent) {
        System.out.println(hufflepuffStudent.getFullName() + " обладает качествами: ");
        System.out.println("Сила магии - " + hufflepuffStudent.getSorcery());
        System.out.println("Расстояние трансгрессии - " + hufflepuffStudent.getTransgression());
        System.out.println("Трудолюбие - " + hufflepuffStudent.getIndustriousness());
        System.out.println("Верность - " + hufflepuffStudent.getLoyalty());
        System.out.println("Честность - " + hufflepuffStudent.getHonesty());
        System.out.println();
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setIndustriousness(int industriousness) {
        HogwartsService.checkParametrValue("industriousness", industriousness);
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        HogwartsService.checkParametrValue("loyalty", loyalty);
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        HogwartsService.checkParametrValue("honesty", honesty);
        this.honesty = honesty;
    }
}
