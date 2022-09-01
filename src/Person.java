public class Person {

    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static void changePerson(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }

    @Override
    public String toString() {
        return  name + " " + surname;
    }
}
