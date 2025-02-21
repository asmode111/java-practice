package HackerRankExamples;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "07:05:45PM";

        System.out.println(timeConversion(s));
    }

    private static String timeConversion(String s) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
        LocalTime inputTime = LocalTime.parse(s, inputFormatter);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        return inputTime.format(outputFormatter);
    }
}
