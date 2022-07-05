import person.Nonvegan;
import person.Person;
import person.Vegan;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Vegan();
        person1.speak();
        person1.eat();

        System.out.println("============================");

        Person person2 = new Nonvegan();
        person2.speak();
        person2.eat();
    }
}
