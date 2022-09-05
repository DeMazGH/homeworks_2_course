public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int sorcery, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, sorcery, transgression);
        if (sorcery < 0 || sorcery > 100 || transgression < 0 || transgression > 100 || mind < 0 || mind > 100 ||
                wisdom < 0 || wisdom > 100 || wit < 0 || wit > 100 || creativity < 0 || creativity > 100) {
            throw new IllegalArgumentException("Параметры могут быть от 0 до 100");
        }
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
            System.out.println(firstStudent.getFullName() + " лучший Когтевранец чем " + secondStudent.getFullName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getFullName() + " лучший Когтевранец чем " + firstStudent.getFullName());
        } else {
            System.out.println(secondStudent.getFullName() + " и " + firstStudent.getFullName() + " одинаково хороши");
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

    public void setMind(int mind) {
        if (mind < 0 || mind > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        if (wisdom < 0 || wisdom > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        if (wit < 0 || wit > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        if (creativity < 0 || creativity > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.creativity = creativity;
    }
}
