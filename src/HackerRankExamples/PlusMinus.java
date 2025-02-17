package HackerRankExamples;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(-1);
        arr.add(1);
        arr.add(1);

        plusMinus(arr);
    }

    private static void plusMinus(List<Integer> arr) {
        int sumOfPositives = 0;
        int sumOfNegatives = 0;
        int sumOfZeros = 0;

        for (Integer number : arr) {
            if (number == 0) {
                sumOfZeros++;
                continue;
            }

            if (number < 0) {
                sumOfNegatives++;
                continue;
            }

            sumOfPositives++;
        }

        int sizeOfArray = arr.size();

        List<Float> result = new ArrayList<>();
        result.add(((float) sumOfPositives / sizeOfArray));
        result.add(((float) sumOfNegatives / sizeOfArray));
        result.add(((float) sumOfZeros / sizeOfArray));

        for (Float number : result) {
            System.out.printf("%.6f\n", number);
        }
    }
}
