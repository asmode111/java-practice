package Games;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"1. Rock", "2. Paper", "3. Scissors"};
        int userChoice;
        int computerChoice;
        boolean playGame = true;
        String nextGameChoice;

        do {
            System.out.println("Make your choice");
            for (String option: options) {
                System.out.println(option);
            }

            computerChoice = random.nextInt(1, 4);
            userChoice = scanner.nextInt();
            scanner.nextLine();

            if (computerChoice == userChoice) {
                System.out.println("Correct choice");
            } else {
                System.out.printf("Wrong choice. Your choice is %s and computer choice is %s\n", options[--userChoice], options[--computerChoice]);
            }

            System.out.print("Do you want to play again(yes/no)? ");
            nextGameChoice = scanner.nextLine();
            System.out.println("****************************");

            if (!nextGameChoice.equals("yes")) {
                System.out.println("Goodbye");
                playGame = false;
            }
        } while(playGame);

        scanner.close();
    }
}
