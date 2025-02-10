package DataStructuresAndAlgorithms.Sort.InsertionSort;

public class Main {
    public static void main(String[] args) {
        // Insertion sort is after comparing elements to the left
        // shift elements to the right to make room to insert a value
        // Quadratic time O(n^2)
        // Small data set = decent
        // Large data set = bad
        // Less steps than Bubble sort
        // Best case is O(n) compared to SelectionSort O(n^2)

        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + "");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                int temp = array[j];
                if (temp < array[j - 1]) {
                // if (temp < array[j - 1]) { // for desc order
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
