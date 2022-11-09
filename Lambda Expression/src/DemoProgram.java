/**
* Introductory Program
* Different way to write lambda expression
*/
interface Lambda{
    public void demo();

}
public class DemoProgram {
    public static void main(String[] args) {

        Lambda lambda = new Lambda() {
            @Override
            public void demo() {
                System.out.println("statement 1");
                System.out.println("statement 2");
            }
        };
        lambda.demo();

        System.out.println("\n**********************\n");

        Lambda lambda1 = () -> {
            System.out.println("statement 1 from lambda1");
            System.out.println("statement 2 from lambda1");
        };
        lambda1.demo();

        System.out.println("\n**********************\n");

        Lambda lambda2 = (() -> {
            System.out.println("statement 1 from lambda 2");
            System.out.println("statement 2 from lambda 2");
        });
        lambda2.demo();

        System.out.println("\n**********************\n");

        Thread thread = new Thread(()->{
            System.out.println("statement 1 from thread");
            System.out.println("statement 2 from thread");
        });
        thread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n**********************\n");

        new Thread(()->{
            System.out.println("statement 1 from anonymous thread class");
            System.out.println("statement 2 from anonymous thread class");
        }).start();
    }
}
