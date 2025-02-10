import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExamples {
    public static void main(String[] args) {

        // basicDateTimeFunctions();
        // customizeDateTime();
        // createCustomDateTime();
        compareDates();
    }

    private static void compareDates() {
        LocalDateTime date1 = LocalDateTime.of(2025, 12, 25, 12, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        System.out.println(date1);
        System.out.println(date2);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is equal to " + date2);
        }
    }

    private static void createCustomDateTime() {
        LocalDate date = LocalDate.of(2024, 12, 25);
        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        System.out.println(dateTime);
    }

    private static void customizeDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);
    }

    private static void basicDateTimeFunctions() {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
