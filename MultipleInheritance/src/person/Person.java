package person;

public abstract class Person implements IsAlive,LiveLife {

    public void speak()
    {
        System.out.println("Shares his/her thought");
    }

    public abstract void eat();

    @Override
    public void breath() {
        System.out.println("be alive, remain living");
    }

    @Override
    public void message() {
        System.out.println("Enjoy learning Java :)");
    }
}
