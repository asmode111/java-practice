package EnumExamples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enums is a special kind of class that
        // represents a fixed set of constants.
        // They improve code readability and are very easy to maintain
        // More efficient with switches when comparing Strings

         // processBasicEnum();
        processWithSwitch();
    }

    private static void processWithSwitch() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String input = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(input);
            switch(day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("Weekday");
                case SATURDAY,
                     SUNDAY -> System.out.println("Weekend");
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Please enter a valid day");
        }

        scanner.close();
    }

    private static void processBasicEnum() {
        Day day = Day.SUNDAY;

        System.out.println(day);
        System.out.println(day.getDayNumber());
    }
}
