public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int sorcery, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, sorcery, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void printStudentComparison(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        if (firstStudent == secondStudent) {
            System.out.println("Нельзя сравнить одного и того же студента");
            return;
        }
        int firstStudentProperties = firstStudent.mind + firstStudent.wisdom + firstStudent.wit + firstStudent.creativity;
        int secondStudentProperties = secondStudent.mind + secondStudent.wisdom + secondStudent.wit + secondStudent.creativity;
        if (firstStudentProperties > secondStudentProperties) {
            System.out.println(firstStudent.getName() + " лучший Когтевранец чем " + secondStudent.getName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getName() + " лучший Когтевранец чем " + firstStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хороши");
        }
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
}
