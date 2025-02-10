package GenericsExamples;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Generics is a concept where you can write a class, interface, or method
        // that is compatible with different data types.
        // <T> type parameter(placeholder that gets replaced with real type)
        // <String>, etc type argument (specifies the type)

        // processBasicArraylist();
        // processObjectGeneric();
        // processObjectGenericWithMultipleTypes();
        printGenerics();
    }

    private static void printGenerics() {
        String[] array1 = {"aaaa", "bbbb", "cccc"};
        Integer[] array2 = {1, 23243, 4534};

        printArray(array1);
        printArray(array2);
    }

    private static <T> void printArray(T[] items) {
        for(T item : items) {
            System.out.println(item);
        }
    }

    private static void processObjectGenericWithMultipleTypes() {
        Product<String, Double> product1 = new Product<>("Pen", 34.34);
        Product<String, Integer> product2 = new Product<>("Ticket", 34);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());

    }

    private static void processObjectGeneric() {
        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());

        Alphabet<Character> alphabet = new Alphabet<>();
        alphabet.setLetter('B');
        System.out.println(alphabet.getLetter());
    }

    private static void processBasicArraylist() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        ArrayList<Boolean> test = new ArrayList<>();
        test.add(true);
        test.add(false);
        test.add(true);
    }
}
