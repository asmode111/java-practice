package DataStructuresAndAlgorithms.Search.LinearSeaerch;

public class Main {
    public static void main(String[] args) {
        // Linear search: Iterate through a collection one element at a time
        // Runtime complexity: O(n)
        // Disadvantages:
        //      Slow for large data sets
        // Advantages:
        //      Fast for searches of small to medium data sets
        //      Does not need to sorted
        //      Useful for data structures that do not have random access(LinkedList)

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 8);

        System.out.println(index);
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
