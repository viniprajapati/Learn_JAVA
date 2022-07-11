public class B extends A {

    private final int x;

//    public B()
//    {
//        super();
//    }

    public B(int x)
    {
        super();
        this.x = x;
    }

    public int getX() {
        return x;
    }

    @Override
    public void india() {
        System.out.println("Hello India");
    }
}
