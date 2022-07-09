package demo;

public class Outer {

    private int y = 101;
    private static int z = 201;

    private static void outerMethod(){
        Inner.testingInnerMethod();
        System.out.println("It's outer method");
        System.out.println("Value of inner class variable : "+Inner.v);
    }

    public static class Inner{

        public static int v = 5;
        public static void testingInnerMethod(){
            System.out.println("Inner class method");
            System.out.println("private variable : "+new Outer().y);
            System.out.println("private static variable : "+z);
//            outerMethod();
        }
    }

    @Override
    public String toString() {
        outerMethod();
        return "Outer{" +
                "y=" + y +
                '}';
    }
}
