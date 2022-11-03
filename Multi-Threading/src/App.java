class MyCounter extends Thread {
    private int threadNo;

    public MyCounter(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        countMe();
    }

    public void countMe(){
        for (int i=1; i<=9; i++){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("the value of i is: "+i+" and the thread number is: "+threadNo);
        }
    }
}
public class App {

    public static void main(String[] args) {
//        System.out.println("hello");
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);
        
        long startTime = System.currentTimeMillis();
        /*
            Simple threading program,
            1st counter1 object thread will execute then counter2 object thread will execute
            counter1.countMe();
            System.out.println("********************************");
            counter1.countMe();
         */
        /*
            Simple threading program,
            1st counter1 object thread will execute then counter2 object thread will execute
            counter1.run();
            System.out.println("********************************");
            counter1.run();
         */

        /*
            Multi-threading program
         */
        counter1.start();
        System.out.println("********************************");
        counter2.start();
        try {
            //  Helps to find total time required for execution
            Thread.sleep(4519);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time required to process: "+(endTime-startTime));
    }
}
