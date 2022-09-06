public class Hogwarts {

    private final String fullName;
    private int sorcery;
    private int transgression;

    public Hogwarts(String fullName, int sorcery, int transgression) {
        HogwartsService.checkParametrValue("sorcery", sorcery);
        HogwartsService.checkParametrValue("transgression", transgression);
        this.fullName = fullName;
        this.sorcery = sorcery;
        this.transgression = transgression;
    }

    public static void printStudentComparison(Hogwarts firstStudent, Hogwarts secondStudent) {
        int firstStudentProperties = firstStudent.sorcery + firstStudent.transgression;
        int secondStudentProperties = secondStudent.sorcery + secondStudent.transgression;
        if (firstStudentProperties > secondStudentProperties) {
            System.out.println(firstStudent.getFullName() + " обладает бОльшей силой магии чем " + secondStudent.getFullName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getFullName() + " обладает бОльшей силой магии чем " + firstStudent.getFullName());
        } else {
            System.out.println(secondStudent.getFullName() + " и " + firstStudent.getFullName() + " одинаково хороши");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public int getSorcery() {
        return sorcery;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setSorcery(int sorcery) {
        HogwartsService.checkParametrValue("sorcery", sorcery);
        this.sorcery = sorcery;
    }

    public void setTransgression(int transgression) {
        HogwartsService.checkParametrValue("transgression", transgression);
        this.transgression = transgression;
    }
}
