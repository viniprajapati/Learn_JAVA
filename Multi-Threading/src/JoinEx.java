public class JoinEx {

    public int counter = 0;

    public static void main(String[] args) {

        final JoinEx joinEx = new JoinEx();

        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    joinEx.counter++;
                }
            }
        });

        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread.join(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                for (int i=0;i<1000;i++){
                    joinEx.counter++;
                }
            }
        });
        thread.start();
        thread1.start();
        try{
//            Thread.sleep(200);
            thread1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("The value of counter is "+joinEx.counter);
    }
}
