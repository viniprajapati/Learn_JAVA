import java.util.Random;

class MyCounter1 implements Runnable{

    private int threadNo;

    public MyCounter1(int threadNo)
    {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {

        Random random = new Random();
        for (int i=0; i<=9; i++)
        {
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value of i is:"+i+" and thread no is:"+threadNo);
        }
    }
}

public class RunableClass {

    public static void main(String[] args) {
        // creating thread using runnable interface
        /* Thread thread1 = new Thread(new MyCounter1(1));
        Thread thread2 = new Thread(new MyCounter1(2));

        thread1.start();
        thread2.start(); */

        // use thread for only once
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=9; i++)
                {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        }).start();
    }
}
