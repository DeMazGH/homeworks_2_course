public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int sorcery, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, sorcery, transgression);
        HogwartsService.checkParametrValue("mind", mind);
        HogwartsService.checkParametrValue("wisdom", wisdom);
        HogwartsService.checkParametrValue("wit", wit);
        HogwartsService.checkParametrValue("creativity", creativity);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void printStudentComparison(Ravenclaw firstStudent, Ravenclaw secondStudent) {
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

    public void printStudentDescription(Ravenclaw ravenclawStudent) {
        System.out.println(ravenclawStudent.getFullName() + " обладает качествами: ");
        System.out.println("Сила магии - " + ravenclawStudent.getSorcery());
        System.out.println("Расстояние трансгрессии - " + ravenclawStudent.getTransgression());
        System.out.println("Ум - " + ravenclawStudent.getMind());
        System.out.println("Мудрость - " + ravenclawStudent.getWisdom());
        System.out.println("Остроумие - " + ravenclawStudent.getWit());
        System.out.println("Творческая мошь - " + ravenclawStudent.getCreativity());
        System.out.println();
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
        HogwartsService.checkParametrValue("mind", mind);
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        HogwartsService.checkParametrValue("wisdom", wisdom);
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        HogwartsService.checkParametrValue("wit", wit);
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        HogwartsService.checkParametrValue("creativity", creativity);
        this.creativity = creativity;
    }
}
