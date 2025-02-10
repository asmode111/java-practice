package Arrays;

public class TwoDimensionalArraysExamples {
    public static void main(String[] args) {
        // 2D array is an array where each element is an array
        // useful for storing a matrix of data

        // method1();
        // method2();
        telephoneNumberPad();
    }

    private static void telephoneNumberPad() {
        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        for (char[] row: telephone) {
            for (char number: row) {
                System.out.print(number + " ");
            }

            System.out.print("\n");
        }
    }

    private static void method2() {
        String[][] groceries = {
                {"apple", "orange", "banana"},
                {"potato", "onion", "carrot"},
                {"chicken", "portk", "fish"}
        };
        printOutArray(groceries);

        groceries[0][0] = "pineapple";
        groceries[1][0] = "celery";
        groceries[2][1] = "eggs";
        printOutArray(groceries);
    }

    private static void method1() {
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "portk", "fish"};

        String[][] groceries = {fruits, vegetables, meats};
        printOutArray(groceries);
    }

    private static void printOutArray(String[][] groceries) {
        for (String[] foods: groceries) {
            for (String food: foods) {
                System.out.print(food + " ");
            }
            System.out.print("\n");
        }

        System.out.println("*************************");
    }
}
