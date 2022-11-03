class Brackets1 {
    synchronized public void generate(){
        synchronized (this){
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i <= 5)
                    System.out.print("{");
                else
                    System.out.print("}");
            }
            System.out.println();
        }

        for (int j=0;j<10;j++){
//            System.out.println("**");
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/**
* Synchronized method approach
* Time required: 6132
*
* Synchronized block approach
* Time required:6100
 */

public class SynchronizationBlock {
    public static void main(String[] args) {

        final Brackets1 brackets1 = new Brackets1();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i=1; i<=5; i++)
                    brackets1.generate();
                long endTime = System.currentTimeMillis();
                System.out.println("Time required for thread1 is "+(endTime-startTime));
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i=1; i<=5; i++)
                    brackets1.generate();
                long endTime = System.currentTimeMillis();
                System.out.println("Time required for thread2 is "+(endTime-startTime));
            }
        }).start();
    }
}
