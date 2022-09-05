public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int sorcery, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, sorcery, transgression);
        if (sorcery < 0 || sorcery > 100 || transgression < 0 || transgression > 100 || industriousness < 0 ||
                industriousness > 100 || loyalty < 0 || loyalty > 100 || honesty < 0 || honesty > 100) {
            throw new IllegalArgumentException("Параметры могут быть от 0 до 100");
        }
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
            System.out.println(firstStudent.getFullName() + " лучший Пуффендуец чем " + secondStudent.getFullName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getFullName() + " лучший Пуффендуец чем " + firstStudent.getFullName());
        } else {
            System.out.println(secondStudent.getFullName() + " и " + firstStudent.getFullName() + " одинаково хороши");
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

    public void setIndustriousness(int industriousness) {
        if (industriousness < 0 || industriousness > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0 || loyalty > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.honesty = honesty;
    }
}
