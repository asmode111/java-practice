package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exception is an event that interrupts the normal flow of a program
        // (Dividing by zero, file not found, mismatch input type)
        // Surround any dangerous code with a try{} block
        // try{} catch{} finally{}

        catchByUserInput();
        catchDivideByZero();
    }

    private static void catchDivideByZero() {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        }
    }

    private static void catchByUserInput() {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        try {
            System.out.print("Enter a number: ");
            userInput = scanner.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Wrong input type");
        } catch(Exception e) {
            System.out.println("Something went wrong");
        } finally {
            scanner.close();

            System.out.println("This always executes");
        }
    }
}
