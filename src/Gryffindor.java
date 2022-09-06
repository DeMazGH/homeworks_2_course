public class Gryffindor extends Hogwarts {

    private int nobleness;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int sorcery, int transgression, int nobleness, int honor, int bravery) {
        super(name, sorcery, transgression);
        HogwartsService.checkParametrValue("nobleness", nobleness);
        HogwartsService.checkParametrValue("honor", honor);
        HogwartsService.checkParametrValue("bravery", bravery);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void printStudentComparison(Gryffindor firstStudent, Gryffindor secondStudent) {
        int firstStudentProperties = firstStudent.nobleness + firstStudent.honor + firstStudent.bravery;
        int secondStudentProperties = secondStudent.nobleness + secondStudent.honor + secondStudent.bravery;
        if (firstStudentProperties > secondStudentProperties) {
            System.out.println(firstStudent.getFullName() + " лучший Гриффиндорец чем " + secondStudent.getFullName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getFullName() + " лучший Гриффиндорец чем " + firstStudent.getFullName());
        } else {
            System.out.println(secondStudent.getFullName() + " и " + firstStudent.getFullName() + " одинаково хороши");
        }
    }

    public void printStudentDescription(Gryffindor gryffindorStudent) {
        System.out.println(gryffindorStudent.getFullName() + " обладает качествами: ");
        System.out.println("Сила магии - " + gryffindorStudent.getSorcery());
        System.out.println("Расстояние трансгрессии - " + gryffindorStudent.getTransgression());
        System.out.println("Благородство - " + gryffindorStudent.getNobleness());
        System.out.println("Честь - " + gryffindorStudent.getHonor());
        System.out.println("Храбрость - " + gryffindorStudent.getBravery());
        System.out.println();
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
        HogwartsService.checkParametrValue("nobleness", nobleness);
        this.nobleness = nobleness;
    }

    public void setHonor(int honor) {
        HogwartsService.checkParametrValue("honor", honor);
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        HogwartsService.checkParametrValue("bravery", bravery);
        this.bravery = bravery;
    }
}
