public class InterruptEx {

    static public int balance = 500;

    public void withdraw(int amount){
        synchronized (this){
            if (balance <= 0 || balance < amount) {
                try {
                    System.out.println("Waiting for balance updation");
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Original balance: "+balance);
                    System.out.println("Withdrawal amount: "+amount);
                    balance -= amount;
                    System.out.println("Withdrawal successful and balance is "+balance);
//                    System.out.println("Thread got interrupted");
//                    return;
                }
            }else {
                System.out.println("else");
            }
        }

    }

    public void deposit(int amount){
        System.out.println("We are deposting the amount "+amount);
        balance += amount;

    }

    public static void main(String[] args) {

        final InterruptEx obj = new InterruptEx();

        final Thread thread1 = new Thread(new Runnable() {
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
                thread1.interrupt();
            }
        });
        thread2.start();
//        if (balance <= 0){
//            try {
//                Thread.sleep(5000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            thread1.interrupt();
//        }
    }
}
