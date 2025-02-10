package Games;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        String word = "pizza";
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordsState = new ArrayList<>();
        int wrongGuesses = 0;
        boolean isSuccess = false;
        String[] letters = word.split("");
        int gameLimit = word.length();

        for (int i = 0; i < gameLimit; i++) {
            wordsState.add('_');
        }

        do {
            System.out.print("Guess a letter: ");
            String guessedLetter = scanner.next();

            if (word.contains(guessedLetter)) {
                for (int i = 0; i < letters.length; i++) {
                    if (guessedLetter.equals(letters[i])) {
                        wordsState.set(i, letters[i].charAt(0));
                    }
                }
            } else {
                wrongGuesses++;
            }

            System.out.print("\n");
            showGuessedWord(wordsState);
            System.out.print("\n");

            if (!wordsState.contains('_')) {
                isSuccess = true;
            }

        } while(wrongGuesses != gameLimit && !isSuccess);

        if (isSuccess) {
            System.out.println("Success!");
        } else {
            System.out.println("Fail!");
        }

        scanner.close();
    }

    static  void showGuessedWord(String[] letters) {
        for (String letter: letters) {
            System.out.print(letter);
        }
    }

    static  void showGuessedWord(ArrayList<Character> letters) {
        for (Character letter: letters) {
            System.out.print(letter);
        }
    }
}
