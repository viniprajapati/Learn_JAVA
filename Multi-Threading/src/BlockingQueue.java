import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{

    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
                queue.put(BlockingQueue.counter++);
                System.out.println("Value added in the queue: "+BlockingQueue.counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{

    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                queue.take();
                BlockingQueue.counter--;
                System.out.println("Value removed in the queue: "+BlockingQueue.counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BlockingQueue {
    static int counter = 1;

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
        Producer producer = new Producer(queue);
        Thread producerThread = new Thread(producer);
        producerThread.start();

        Consumer consume = new Consumer(queue);
        Thread consumerThread = new Thread(consume);
        consumerThread.start();
    }
}
