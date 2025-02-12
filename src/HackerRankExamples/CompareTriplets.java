package HackerRankExamples;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(99);
        b.add(16);
        b.add(8);

        System.out.println(compareTriplets(a, b));
    }

    private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int user1Point = 0;
        int user2Point = 0;
        for(int i = 0; i < a.size(); i++) {
            System.out.println("One " + i);
            if (a.get(i) == b.get(i)) {
                continue;
            }

            if (a.get(i) > b.get(i)) {
                user1Point++;
                continue;
            }

            user2Point++;
        }

        List<Integer> response = new ArrayList<>();
        response.add(user1Point);
        response.add(user2Point);

        return response;
    }
}
