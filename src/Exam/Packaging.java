package Exam;

public class Packaging {

    private static final int itemPerLargePackage = 5;

    public static long minimalNumberOfPackages(long items, long availableLargePackages, long availableSmallPackages) {

        if (items == 0) {
            return -1;
        }

        if (availableLargePackages == 0 && availableSmallPackages == 0) {
            return -1;
        }

        if (availableLargePackages == 0) {
            return processSmallPackages(items, availableSmallPackages);
        }

        return processLargePackages(items, availableLargePackages);
    }

    private static long processLargePackages(long items, long availableLargePackages) {

        if (items % itemPerLargePackage == 0) {
            return items / itemPerLargePackage;
        }

        long numberOfItemsForLargePackages = items / itemPerLargePackage;
        numberOfItemsForLargePackages++;

        if (availableLargePackages < numberOfItemsForLargePackages) {
            return -1;
        }

        return numberOfItemsForLargePackages;
    }

    private static long processSmallPackages(long items, long availableSmallPackages) {
        if (items > availableSmallPackages) {
            return -1;
        }

        return items;
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(13, 3, 10));
        System.out.println(minimalNumberOfPackages(10, 2, 0));
        System.out.println(minimalNumberOfPackages(10, 0, 10));
        System.out.println(minimalNumberOfPackages(4, 1, 2));
        System.out.println(minimalNumberOfPackages(4, 0, 0));
        System.out.println(minimalNumberOfPackages(4, 0, 2));
        System.out.println(minimalNumberOfPackages(6, 10, 1));
    }
}
