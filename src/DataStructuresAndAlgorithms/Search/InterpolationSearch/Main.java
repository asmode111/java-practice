package DataStructuresAndAlgorithms.Search.InterpolationSearch;

public class Main {
    public static void main(String[] args) {
        // Improvements over binary search best used for uniformly distributed
        // guesses where a value might be based on calculated probe results
        // if probe is incorrect, search area is narrowed and a new probe is calculated

        // average case: O(log(long(n)))
        // worst case: O(n) [values increase exponentially]

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = interpolationSearch(array, 8);
        System.out.println(index);

        index = interpolationSearch(array, 1);
        System.out.println(index);

        int[] array2 = {1, 2, 4, 8, 32, 64, 128, 256, 512, 1024};
        index = interpolationSearch(array2, 64);
        System.out.println(index);

    }

    private static int interpolationSearch(int[] array, int value) {

        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {
            int probe = low
                    + (high - low)
                    * (value - array[low])
                    / (array[high] - array[low])
                    ;

            System.out.println("Probe: " + probe);

            if (array[probe] == value) {
                return probe;
            }

            if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return -1;
    }
}
