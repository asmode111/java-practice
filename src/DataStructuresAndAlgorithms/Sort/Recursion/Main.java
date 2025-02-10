package DataStructuresAndAlgorithms.Sort.Recursion;

public class Main {
    public static void main(String[] args) {
        // A recursive method calls itself.
        // Commonly used with advanced sorting algorithms and navigating trees.
        // Advantages:
        // Easier to read/write
        // Easier to debug
        // Disadvantages:
        // Sometimes slower
        // Uses more memory

        // walk(5);
        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    private static int factorial(int num) {
        if (num < 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    private static void walk(int steps) {
        if (steps < 1) {
            return;
        }

        System.out.println("You take a step: " + steps);
        walk(steps - 1);
    }
}
