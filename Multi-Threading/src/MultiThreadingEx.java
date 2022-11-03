public class MultiThreadingEx {

    public static int counter = 0;

    public static void main(String[] args) {

        //  Implementing runnable interface
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
               for (int i=1; i<1000;i++){
                   MultiThreadingEx.counter++;
               }
                System.out.println("1st for loop is over");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<1000;i++){
                    MultiThreadingEx.counter++;
                }
                System.out.println("2nd for loop is over");
            }
        });

        thread1.start();
        thread2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The value of counter is "+ MultiThreadingEx.counter);
    }
}
