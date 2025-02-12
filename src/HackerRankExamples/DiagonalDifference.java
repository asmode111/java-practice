package HackerRankExamples;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> subArr1 = new ArrayList<>();
        subArr1.add(11);
        subArr1.add(2);
        subArr1.add(4);
        subArr1.add(1);

        List<Integer> subArr2 = new ArrayList<>();
        subArr2.add(4);
        subArr2.add(5);
        subArr2.add(6);
        subArr2.add(1);

        List<Integer> subArr3 = new ArrayList<>();
        subArr3.add(10);
        subArr3.add(8);
        subArr3.add(-12);
        subArr3.add(1);

        List<Integer> subArr4 = new ArrayList<>();
        subArr4.add(1);
        subArr4.add(1);
        subArr4.add(1);
        subArr4.add(1);

        arr.add(subArr1);
        arr.add(subArr2);
        arr.add(subArr3);
        arr.add(subArr4);

        System.out.println(diagonalDifference(arr));
    }

    private static int diagonalDifference(List<List<Integer>> arr) {
        int last = arr.size() - 1;
        int sumLeftToRight = 0;
        int sumRightToLeft = 0;

        for (int i = 0; i <= last; i++) {
            sumLeftToRight += arr.get(i).get(i);
        }

        int i = 0;
        for (int j = last; j >= 0; j--) {
            sumRightToLeft += arr.get(j).get(i);
            i++;
        }

        return Math.abs((sumLeftToRight - sumRightToLeft));
    }
}
