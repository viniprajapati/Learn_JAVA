class NewThread extends Thread{

    String threadName;
    ThreadGroup threadGroup;

    public NewThread(String threadName, ThreadGroup threadGroup) {
        this.threadName = threadName;
        this.threadGroup = threadGroup;
    }

    @Override
    public void run() {
        for(int i=1; i<=100; i++){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("The exception has been encountered " + e);
            }
        }
        System.out.println(threadName + " thread has finished execution");
    }
}
public class ThreadGroupEx {
    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("The parent group of threads");
        ThreadGroup ctg = new ThreadGroup(tg, "The child group");

        NewThread th1 = new NewThread("thread 1",tg);
        System.out.println("Starting the first thread");
        th1.start();

        NewThread th2 = new NewThread("thread 2", tg);
        System.out.println("Starting the second thread");
        th2.start();

        NewThread th3 = new NewThread("thread 3", ctg);
        System.out.println("Starting the third thread");
        th3.start();

        /*Checking the number of active thread*/
        System.out.println("The total number of active threads are : "+tg.activeCount());

        /*Checking the number of active thread group*/
        System.out.println("The total number of active thread groups are : "+tg.activeGroupCount());

        /*Returning the number of threads kept in this array*/
        Thread[] grp = new Thread[tg.activeCount()];
        int count = tg.enumerate(grp);
        System.out.println("count value is : "+count);

        for (int i=0; i<count; i++)
            System.out.println("Thread "+grp[i].getName()+" is found");

        /*Printing the parent ThreadGroup of both the ThreadGroups*/
        System.out.println("The parent thread group for "+tg.getName()+" is "+tg.getParent().getName());
        System.out.println("The parent thread group for "+ctg.getName()+" is "+ctg.getParent().getName());

        /*Destroying the thread groups*/
        /*ctg.destroy();
        System.out.println(ctg.getName()+" is destroyed");*/

    }
}
