package DataStructuresAndAlgorithms.PriorityQueuesStructure;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // Priority queues: A FIFO data structure that serves elements
        // with the highest priorities first
        // before elements with lower priority

        // processQueue();
        processReverseQueue();
        processStringQueue();
    }

    private static void processStringQueue() {
        Queue<String> queue = new PriorityQueue<>();
        // Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    private static void processReverseQueue() {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(1.0);
        queue.offer(3.0);
        queue.offer(2.3);
        queue.offer(1.1);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    private static void processQueue() {
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
