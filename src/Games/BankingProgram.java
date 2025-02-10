package Games;

import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Java banging program
        // declare variables
        // display menu
        // get and process user choice
        // showBalance()
        // deposit()
        // withdraw()
        // exit message

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning) {
            System.out.println("***************");
            System.out.println("Banking program");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }

    private static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }

    private static double deposit() {
        double amount;
        System.out.println("***************");
        System.out.print("Enter amount to deposit: ");;
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("***************");
            System.out.println("Invalid amount");
            return 0;
        }

        return amount;
    }

    private static double withdraw(double balance) {
        double amount;
        System.out.println("***************");
        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("***************");
            System.out.println("Invalid amount");
            return 0;
        }

        if (amount > balance) {
            System.out.println("***************");
            System.out.println("Insufficient balance");
            return 0;
        }

        return amount;
    }
}
