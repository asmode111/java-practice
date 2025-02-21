package HackerRankExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);

        miniMaxSum(arr);
    }

    private static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long sumMin = arr.stream().limit(arr.size()-1).mapToLong(Integer::intValue).sum();

        arr.sort(Collections.reverseOrder());
        long sumMax = arr.stream().limit(arr.size()-1).mapToLong(Integer::intValue).sum();

        System.out.printf("%d %d", sumMin, sumMax);
    }
}
