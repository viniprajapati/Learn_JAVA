import demo.Outer;

public class Main {

    public static void main(String[] args) {

        System.out.println(TestStatic.x);
        TestStatic.x = 5;
        System.out.println(TestStatic.x);

        System.out.println("============================");
        Outer.Inner.testingInnerMethod();
        System.out.println("============================");
        System.out.println("Calling object");
        System.out.println("============================");
        System.out.println(new Outer());;
//        new Outer();
    }
}
