package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExamples {
    public static void main(String[] args) {
        // array is a collection of values of the same data type
        // think of it as a variable that can store more than 1 value

        // basicArrayOperations();
        // enterUserInputInArray();
        // inputUserInputInArray();
        // searchIntInArray();
        SearchStringInArray();
    }

    private static void SearchStringInArray() {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "banana", "lemon"};
        String target;
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                isFound = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if (!isFound) {
            System.out.println("Not found");
        }

        scanner.close();
    }

    private static void searchIntInArray() {
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 5;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                isFound = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if (!isFound) {
            System.out.println("Not found");
        }
    }

    private static void inputUserInputInArray() {
        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size = 0;

        System.out.print("Enter the number of the foods:");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a food: ");
            String inputFood = scanner.nextLine();
            foods[i] = inputFood;
        }

        for (String food: foods) {
            System.out.println(food);
        }

        scanner.close();
    }

    private static void enterUserInputInArray() {
        String[] foods = new String[3];

        foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "hamburger";

        for (String food: foods) {
            System.out.println(food);
        }

        System.out.println(foods.length);
    }

    private static void basicArrayOperations() {
        String fruit = "apple";
        System.out.println(fruit);

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        // System.out.println(fruits); // It generates the memory address of the array
        // because array is a reference type, not a primitive type

        System.out.println(fruits[0]);

        fruits[0] = "pineapple";
        System.out.println(fruits[0]);

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        for (int i = 0; i < numOfFruits - 1; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("****************");

        // enhanced loop
        for (String fruit2: fruits) {
            System.out.println(fruit2);
        }

        System.out.println("****************");

        Arrays.sort(fruits);
        for (String fruit2 : fruits) {
            System.out.println(fruit2);
        }

        System.out.println("****************");

        Arrays.fill(fruits, "pineapple");
        for (String fruit3: fruits) {
            System.out.println(fruit3);
        }
    }
}
