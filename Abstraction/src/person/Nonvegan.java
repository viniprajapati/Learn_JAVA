package person;

public class Nonvegan extends Person {

    @Override
    public void eat() {
        System.out.println("Eats non vegan food");
    }
}
