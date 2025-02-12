package HackerRankExamples;

import java.util.ArrayList;
import java.util.List;

public class VeryBigSum {
    public static void main(String[] args) {
        List<Long> ar = new ArrayList<>();
        ar.add(1000000001L);
        ar.add(1000000002L);
        ar.add(1000000003L);
        ar.add(1000000004L);
        ar.add(1000000005L);

        System.out.println(aVeryBigSum(ar));
    }

    private static long aVeryBigSum(List<Long> ar) {
        return ar.stream().mapToLong(Long::longValue).sum();
    }

    private static long aVeryBigSumVersion2(List<Long> ar) {
        long response = 0L;
        for(long i : ar) {
            response += i;
        }

        return response;
    }
}
