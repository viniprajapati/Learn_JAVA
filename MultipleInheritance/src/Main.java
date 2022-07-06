import person.Person;
import person.Vegan;

public class Main {

    public static void main(String[] args) {
        Person person = new Vegan();
        person.breath();
        person.eat();
        person.speak();
        person.message();
    }
}
