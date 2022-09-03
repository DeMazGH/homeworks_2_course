public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int sorcery, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, sorcery, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void printStudentComparison(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        if (firstStudent == secondStudent) {
            System.out.println("Нельзя сравнить одного и того же студента");
            return;
        }
        int firstStudentProperties = firstStudent.industriousness + firstStudent.loyalty + firstStudent.honesty;
        int secondStudentProperties = secondStudent.industriousness + secondStudent.loyalty + secondStudent.honesty;
        if (firstStudentProperties > secondStudentProperties) {
            System.out.println(firstStudent.getName() + " лучший Пуффендуец чем " + secondStudent.getName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getName() + " лучший Пуффендуец чем " + firstStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хороши");
        }
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
}
