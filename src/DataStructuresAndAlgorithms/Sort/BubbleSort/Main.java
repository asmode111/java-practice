package DataStructuresAndAlgorithms.Sort.BubbleSort;

public class Main {
    public static void main(String[] args) {
        // Bubble sort is a sorting algorithm.
        // Compares the elements one by one and sort them accordingly by using temp.
        // It is pairs of adjacent elements are compared and the elements
        // swapped if they are not in order.

        // Quadratic time O(n^2)
        // Small data set = okay-ish
        // Large data set = bad

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        for (int i : array) {
            System.out.print(i + "");
        }

        System.out.print("\n");

        bubbleSort(array);
        for (int j : array) {
            System.out.print(j + "");
        }
    }

    private static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                // if(array[j] < array[j+1]) { // order by desc
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
