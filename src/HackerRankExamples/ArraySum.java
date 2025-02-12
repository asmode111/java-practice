package HackerRankExamples;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(10);
        array.add(11);

        int result = simpleArraySum(array);

        System.out.println(result);
    }

    private static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int number : ar) {
            sum += number;
        }

        return sum;
    }
}
