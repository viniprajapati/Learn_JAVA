package Dequeue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    public static void main(String[] args) {

        Deque<Integer> dequeue = new LinkedBlockingDeque<Integer>();

        for (int i=0; i<7; i++)
            dequeue.offer(i+1);

        System.out.println("*******After inserting data*******");
        for (Integer element:dequeue) {
            System.out.println(element);
        }

        System.out.println("*******After inserting element at 1st position*******");
        dequeue.offerFirst(-1);
        dequeue.addFirst(0);
        for (Integer element:dequeue) {
            System.out.println(element);
        }

        System.out.println("*******After inserting element at last position*******");
        dequeue.addLast(8);
        dequeue.offerLast(9);
        for (Integer element:dequeue) {
            System.out.println(element);
        }

        System.out.println("*******After removing element at last position*******");
        dequeue.removeLast();
        dequeue.pollLast();
        for (Integer element:dequeue) {
            System.out.println(element);
        }

        System.out.println("*******After removing element at 1st position*******");
        dequeue.removeFirst();
        dequeue.pollFirst();
        for (Integer element:dequeue) {
            System.out.println(element);
        }

        System.out.println("*******Take 1st element from queue*******");
        System.out.println(dequeue.getFirst());
//        System.out.println(dequeue.peekFirst());

        System.out.println("*******Take last element from queue*******");
        System.out.println(dequeue.getLast());
//        System.out.println(dequeue.peekLast());
    }
}
