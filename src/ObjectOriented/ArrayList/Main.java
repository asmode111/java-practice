package ObjectOriented.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ArrayList is a resizeable array that stores objects(autoboxing).
        // Arrays are fixed in size but ArrayLists can change.

        processIntArrayList();
        processDoubleArrayList();
        processStringArrayList();
        dynamicArrayListByUserInput();
    }

    private static void dynamicArrayListByUserInput() {

        ArrayList<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String userFood;
        int numberOfFoods;

        System.out.print("Enter the number of the food: ");
        numberOfFoods = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numberOfFoods; i++) {
            System.out.printf("Enter the food #%d: ", i);
            userFood = scanner.nextLine();
            foods.add(userFood);
        }

        for (String row: foods) {
            System.out.println(row);
        }

        scanner.close();
    }

    private static void processStringArrayList() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Coconut");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.set(0, "Pineapple");
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());

        Collections.sort(list);
        System.out.println(list);

        for (String fruit: list) {
            System.out.println(fruit);
        }
    }

    private static void processDoubleArrayList() {
        ArrayList<Double> list = new ArrayList<>();

        list.add(1.1);
        list.add(2.34);
        list.add(3.3);

        System.out.println(list);
    }

    private static void processIntArrayList() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        System.out.println(list);
    }
}
