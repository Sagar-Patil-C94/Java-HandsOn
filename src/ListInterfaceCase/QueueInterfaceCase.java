package ListInterfaceCase;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueInterfaceCase {
    public static void main(String[] args) {

        // PriorityQueue Class
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // adding elements
        priorityQueue.add(50);
        priorityQueue.add(20);
        priorityQueue.offer(300);
        System.out.println(priorityQueue);
        // To access elements from a priority queue, we can use the peek() method. This method returns the head of the queue
        System.out.println(priorityQueue.peek());
        //remove() - removes the specified element from the queue
        System.out.println(priorityQueue.remove(300));
        //poll() - returns and removes the head of the queue
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        // size
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.contains(50));

        // PriorityQueue Comparator
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int value = o1.compareTo(o2);
                // elements are sorted in reverse order
                if (value > 0) {
                    return -1;
                } else if (value < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        priorityQueue1.add(20);
        priorityQueue1.add(30);
        System.out.println(priorityQueue1);

        // Deque Interface - LinkedList
        // Similar to List's Linked List
        // we can use this as queue by using peek and poll methods
        // we can use this as dequeue by using addFirst and addLast methods


        // ArrayDeque - Implements Deque interface
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offerFirst(100);
        arrayDeque.offerLast(390);
        arrayDeque.offerFirst(390);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.peek());


    }
}
