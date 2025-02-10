package DataStructuresAndAlgorithms.Search.BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Binary search: Finds the position of a target value within a sorted array
        // Half of the array is eliminated during each "step"

        // Should be sorted collection
        // Checks the middle element,
        // if it is smaller than the searched element,
        // the first half of the collection is removed and
        // search is done on the rest with the same logic.

        // It is efficient with large datasets.

        int[] array = getArray(1000000);
        int target = 738484;

        // processJavaBinarySearch(array, target);
        System.out.println(processCustomBinarySearch(array, target));
    }

    private static int processCustomBinarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("Middle " + value);

            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    private static void processJavaBinarySearch(int[] array, int target) {

        int index = Arrays.binarySearch(array, target);

        System.out.println(index);
    }

    private static int[] getArray(int capacity) {
        int array[] = new int[capacity];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        return array;
    }
}
