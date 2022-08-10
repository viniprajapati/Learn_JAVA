package Queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueMain {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedBlockingDeque<Integer>();

        try {
            queue.remove();
        }catch (NoSuchElementException e){
            System.out.println("Queue is empty");
        }
        for (int i=0; i <6; i++)
            queue.add(i+1);
        queue.add(7);

        System.out.println("=======================================");
        System.out.println(queue.element());
        System.out.println("=======================================");

        for(Integer element:queue)
            System.out.println(element);
    }
}
