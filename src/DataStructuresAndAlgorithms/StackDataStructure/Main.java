package DataStructuresAndAlgorithms.StackDataStructure;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Stack is a LIFO data structure.
        // Stores objects into a sort of "vertical tower"
        // push() to add to the top of the stack
        // pop() to remove from the top of the stack

        // Usage:
        // 1 - undo/redo features in text editors
        // 2 - moving back/forward through the browser history
        // 3 - backtracking algorithms (maze, file directories)
        // 4 - calling functions (call stack)

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack);

        // Remove or return the last element of the stack
        String myFavGame = stack.pop();
        System.out.println(myFavGame);
        System.out.println(stack);

        // Get the last element of the stack without removing it
        System.out.println(stack.peek());

        // Search the index of the item in the stack
        System.out.println(stack.search("DOOM"));
        System.out.println(stack.search("xxxx")); // returns -1 when it is not in the stack
    }
}
