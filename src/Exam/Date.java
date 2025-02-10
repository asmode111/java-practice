package Exam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.time.format.DateTimeParseException;

public class Date {
    public static List<String> transformDateFormat(List<String> dates) {

        List<String> responseDates = new ArrayList<>();
        DateTimeFormatter inputFormatter = new DateTimeFormatterBuilder()
                .appendOptional(DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                .appendOptional(DateTimeFormatter.ofPattern("MM-dd-yyyy"))
                .appendOptional(DateTimeFormatter.ofPattern("yyyyddMM"))
                .toFormatter();
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyyddMM");

        for (String date : dates) {
            try {
                if (date.contains("p")) {
                    date = date
                            .replace("p", "")
                            .replace(" ", "");
                }

                responseDates.add(LocalDate.parse(date, inputFormatter).format(outputFormatter));
            } catch(DateTimeParseException e) {
                // Ignore unwanted formats.
                System.out.println(e.getMessage());
            }
        }

        return responseDates;
    }

    public static void main(String[] args) {
        List<String> dates = transformDateFormat(Arrays.asList("2010/02/20", "2 016p 19p 12", "11-18-2012", "2018 12 24", "20130720"));
        for(String date : dates) {
            System.out.println(date);
        }
    }
}
