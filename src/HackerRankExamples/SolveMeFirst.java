package HackerRankExamples;

import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        System.out.println(solveMeFirst(number1, number2));
    }

    private static int solveMeFirst(int number1, int number2) {
        return number1 + number2;
    }
}
