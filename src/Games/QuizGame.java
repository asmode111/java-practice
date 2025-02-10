package Games;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "First question?",
                "Second question?",
                "Third question?",
        };

        String[][] options = {
                {"abcd", "defg", "hijk", "lmno"},
                {"1234", "5678", "9012", "2345"},
                {"xytz", "pksl", "afds", "yyyy"},
        };

        int[] answers = {2, 0, 1};
        int totalCorrectAnswer = 0;
        int totalWrongAnswer = 0;

        System.out.println("Welcome to the quiz game.");
        System.out.println("**********************");

        int questionIndex = 0;
        for (String[] optionRow: options) {
            int questionNumber = questionIndex + 1;
            System.out.printf("Question %d: %s\n", questionNumber, questions[questionIndex]);

            int optionIndex = 0;
            for (String option: optionRow) {
                int optionNumber = optionIndex + 1;
                optionIndex++;

                System.out.printf("%d. %s\n", optionNumber, option);
            }

            int userAnswer;
            System.out.print("Your answer is: ");
            userAnswer = scanner.nextInt();
            if (userAnswer == answers[questionIndex]) {
                totalCorrectAnswer++;
                System.out.println("CORRECT!");
            } else {
                totalWrongAnswer++;
                System.out.println("WRONG!");
            }

            questionIndex++;
            System.out.println("**********************");
        }

        System.out.printf("Number of correct answers is %d\n", totalCorrectAnswer);
        System.out.printf("Number of wrong answers is %d\n", totalWrongAnswer);

        scanner.close();
    }
}
