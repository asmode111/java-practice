package HackerRankExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);

        System.out.println(birthdayCakeCandles(candles));
    }

    private static int birthdayCakeCandles(List<Integer> candles) {
        candles.sort(Collections.reverseOrder());
        int countOfCandles = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (i == 0) {
                countOfCandles++;
                continue;
            }

            if (candles.get(i).equals(candles.get(i - 1))) {
                countOfCandles++;
                continue;
            }

            break;
        }

        return countOfCandles;
    }
}
