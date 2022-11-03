import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {
    static int counter = 0;
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    for (int i=1; i<=1000; i++){
                        ReentrantLockEx.counter++;
                    }
                }finally {

                    lock.unlock();
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    for (int i=1; i<=1000; i++){
                        ReentrantLockEx.counter++;
                    }
                }
                finally {

                    lock.unlock();
                }
            }
        });

        thread.start();
        thread1.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The final value of counter is "+ReentrantLockEx.counter);
    }
}
