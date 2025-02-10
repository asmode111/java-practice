package Games;

import java.util.Random;
import java.util.Scanner;

public class DiceRollerGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.printf("You rolled %d\n", roll);
                total += roll;
            }

            System.out.printf("Total %d\n", total);
        } else {
            System.out.println("You don't have enough dice to roll");
        }

        scanner.close();
    }

    static void printDie(int roll) {
        String dice = """
                -------
                |     |
                |  .  |
                |     |
                -------
                """;

        System.out.print(dice);
    }
}
