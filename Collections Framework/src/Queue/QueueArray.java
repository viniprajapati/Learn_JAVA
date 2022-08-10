package Queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueArray {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayBlockingQueue<Integer>(6);

        try{
            queue.peek();
            queue.remove();
        }catch (NoSuchElementException e)
        {
            System.out.println("Queue is empty");
        }

        for(int i=0; i<6; i++)
        {
            queue.add(i+1);
        }

        try {
            queue.add(7);
        }catch(IllegalStateException e) {
            System.out.println("Queue is full");
        }

        for (Integer element:queue)
            System.out.println(element);

        System.out.println("=======================================");
        System.out.println("First element of queue is :"+queue.peek());
        System.out.println("=======================================");
        queue.remove();
        queue.add(7);
        for(Integer element:queue)
            System.out.println(element);
    }
}
