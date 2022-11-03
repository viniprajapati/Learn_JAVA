public class WaitAndNotifyEx {

    static public int balance = 0;

    public void withdraw(int amount){
        synchronized (this){
            if (balance <= 0) {
                try {

                    System.out.println("Waiting for balance updation");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        balance -= amount;
        System.out.println("Withdrawal successful");
    }

    public void deposit(int amount){
        System.out.println("We are deposting the amount");
        balance += amount;
        System.out.println("balance is "+balance);
        synchronized (this){
            notify();
        }
    }

    public static void main(String[] args) {
        final WaitAndNotifyEx obj = new WaitAndNotifyEx();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(1000);
            }
        });
        thread1.setName("Thread 1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{

                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                obj.deposit(2000);
            }
        });
        thread2.setName("Thread 2");
        thread2.start();
    }
}
