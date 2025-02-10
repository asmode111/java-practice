package DataStructuresAndAlgorithms.LinkedListStructure;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        // LinkedList stores Nodes in 2 parts (data + address)
        // Nodes are in non-consecutive memory locations
        // Elements are linked using pointers
        // Advantages:
        // 1 - Dynamic Data Structure: Allocates needed memory while running
        // 2 - Insertion and Deletion of Nodes is easy O(1)
        // 3 - No/Low memory waste
        // Disadvantages:
        // 1 - Greater memory usage(additional pointer)
        // 2 - No random access of elements (no index[i])
        // 3 - Accessing/searching elements is more time consuming O(n)
        // Usage:
        // 1 - Implement Stacks/Queues
        // 2 - GPS navigation
        // 3 - Music playlist

        // processBasicLinkedListFunctions();
        // processBasicLinkedListFunctions2();
        processPopPollFunctions();
    }

    private static void processPopPollFunctions() {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(1);
        linkedList.push(2);
        linkedList.offer(3);

        System.out.println(linkedList.get(2));

        for (Integer element : linkedList) {
            System.out.println(element);
        }

        linkedList.clear();

        try {
            linkedList.pop();
        } catch(NoSuchElementException e) {
            System.out.println("No element found");
        }

        System.out.println(linkedList.poll());
    }

    private static void processBasicLinkedListFunctions2() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.offer("A"); // add to bottom of the LinkedList
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        linkedList.remove("E");
        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");

        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        linkedList.poll();

        System.out.println(linkedList);
    }

    private static void processBasicLinkedListFunctions() {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.push("A"); // add to top of the LinkedList
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        linkedList.pop(); // removes and returns the first element of the list

        System.out.println(linkedList);
    }
}
