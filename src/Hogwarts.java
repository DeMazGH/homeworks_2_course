public class Hogwarts {

    private final String name;
    private int sorcery;
    private int transgression;

    public Hogwarts(String name, int sorcery, int transgression) {
        if (sorcery < 0 || sorcery > 100 || transgression < 0 || transgression > 100) {
            throw new IllegalArgumentException("Параметры могут быть от 0 до 100");
        }
        this.name = name;
        this.sorcery = sorcery;
        this.transgression = transgression;
    }

    public void printStudentDescription(Gryffindor gryffindorStudent) {
        System.out.println(gryffindorStudent.getName() + " обладает качествами: ");
        System.out.println("Сила магии - " + gryffindorStudent.getSorcery());
        System.out.println("Расстояние трансгрессии - " + gryffindorStudent.getTransgression());
        System.out.println("Благородство - " + gryffindorStudent.getNobleness());
        System.out.println("Честь - " + gryffindorStudent.getHonor());
        System.out.println("Храбрость - " + gryffindorStudent.getBravery());
        System.out.println();
    }

    public void printStudentDescription(Slytherin slytherinStudent) {
        System.out.println(slytherinStudent.getName() + " обладает качествами: ");
        System.out.println("Сила магии - " + slytherinStudent.getSorcery());
        System.out.println("Расстояние трансгрессии - " + slytherinStudent.getTransgression());
        System.out.println("Хитрость - " + slytherinStudent.getCunning());
        System.out.println("Решительность - " + slytherinStudent.getDecisiveness());
        System.out.println("Амбициозность - " + slytherinStudent.getAmbitiousness());
        System.out.println("Находчивость - " + slytherinStudent.getResourcefulness());
        System.out.println("Жажда власти - " + slytherinStudent.getPowerLust());
        System.out.println();
    }

    public void printStudentDescription(Ravenclaw ravenclawStudent) {
        System.out.println(ravenclawStudent.getName() + " обладает качествами: ");
        System.out.println("Сила магии - " + ravenclawStudent.getSorcery());
        System.out.println("Расстояние трансгрессии - " + ravenclawStudent.getTransgression());
        System.out.println("Ум - " + ravenclawStudent.getMind());
        System.out.println("Мудрость - " + ravenclawStudent.getWisdom());
        System.out.println("Остроумие - " + ravenclawStudent.getWit());
        System.out.println("Творческая мошь - " + ravenclawStudent.getCreativity());
        System.out.println();
    }

    public void printStudentDescription(Hufflepuff hufflepuffStudent) {
        System.out.println(hufflepuffStudent.getName() + " обладает качествами: ");
        System.out.println("Сила магии - " + hufflepuffStudent.getSorcery());
        System.out.println("Расстояние трансгрессии - " + hufflepuffStudent.getTransgression());
        System.out.println("Трудолюбие - " + hufflepuffStudent.getIndustriousness());
        System.out.println("Верность - " + hufflepuffStudent.getLoyalty());
        System.out.println("Честность - " + hufflepuffStudent.getHonesty());
        System.out.println();
    }

    public void printStudentComparison(Hogwarts firstStudent, Hogwarts secondStudent) {
        if (firstStudent == secondStudent) {
            System.out.println("Нельзя сравнить одного и того же студента");
            return;
        }
        int firstStudentProperties = firstStudent.sorcery + firstStudent.transgression;
        int secondStudentProperties = secondStudent.sorcery + secondStudent.transgression;
        if (firstStudentProperties > secondStudentProperties) {
            System.out.println(firstStudent.getName() + " обладает бОльшей силой магии чем " + secondStudent.getName());
        } else if (firstStudentProperties < secondStudentProperties) {
            System.out.println(secondStudent.getName() + " обладает бОльшей силой магии чем " + firstStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хороши");
        }
    }

    public String getName() {
        return name;
    }

    public int getSorcery() {
        return sorcery;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setSorcery(int sorcery) {
        if (sorcery < 0 || sorcery > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.sorcery = sorcery;
    }

    public void setTransgression(int transgression) {
        if (transgression < 0 || transgression > 100) {
            throw new IllegalArgumentException("Параметр может быть от 0 до 100");
        }
        this.transgression = transgression;
    }
}
