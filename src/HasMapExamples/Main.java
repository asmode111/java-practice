package HasMapExamples;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HasMap is a data structure that stores key-value pairs
        // Keys are unique, but values can be duplicated
        // Does not maintain any order, but is memory efficient
        // HasMap<Key, Value>

        HashMap<String, Double> fruits = new HashMap<>();

        fruits.put("apple", 0.5);
        fruits.put("orange", 0.75);
        fruits.put("banana", 2.2);
        fruits.put("orange", 34343.2); // overrides the first orange key
        System.out.println(fruits);

        fruits.put("coconut", 2.2);
        System.out.println(fruits);

        fruits.remove("apple");
        System.out.println(fruits);

        System.out.println(fruits.get("banana"));

        System.out.println(fruits.containsKey("orange"));
        System.out.println(fruits.containsKey("apple"));

        if (fruits.containsKey("apple")) {
            System.out.println(fruits.get("apple"));
        } else {
            System.out.println("Key not found");
        }

        System.out.println(fruits.containsValue(2.2));
        System.out.println(fruits.containsValue(2.3));

        System.out.println(fruits.size());
        fruits.put("lemon", 343.343);
        System.out.println(fruits.size());

        for (String key : fruits.keySet()) {
            System.out.println(key + " $" + fruits.get(key));
        }
    }
}
