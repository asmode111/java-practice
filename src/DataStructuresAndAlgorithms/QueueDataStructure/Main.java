package DataStructuresAndAlgorithms.QueueDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Queue = FIFO data structure
        // A collection designed for holding elements prior to processing
        // add = enqueue, offer()
        // remove = dequeue, poll()

        // Usage:
        // 1 - Keyboard buffer: Letters should appear on the screen in the order they are pressed
        // 2 - Printer queue: Print jobs should be completed in order
        // 3 - Used in LinkedList, PriorityQueues, Breadth-first search

        Queue<String> queue = new LinkedList<>();

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Harold");

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll(); // Remove the first element of the queue
        System.out.println(queue);

        System.out.println(queue.contains("Harold"));

        queue.poll();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());


    }
}
