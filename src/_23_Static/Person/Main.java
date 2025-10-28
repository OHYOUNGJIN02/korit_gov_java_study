package _23_Static.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person.showPopulation();
        Person person1 = new Person();
        Person.showPopulation();
        System.out.println(person.COUNTRY == person1.COUNTRY);
    }
}
