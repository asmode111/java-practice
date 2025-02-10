package DataStructuresAndAlgorithms.DynamicArrayStructure;

public class Main {
    public static void main(String[] args) {

        // processBasicMethods();
        processGrowAndShrinkMethod();
    }

    private static void processGrowAndShrinkMethod() {
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println(dynamicArray);

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println(dynamicArray);
    }

    private static void processBasicMethods() {
        DynamicArray dynamicArray = new DynamicArray();

        System.out.println(dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert(0, "X");
        dynamicArray.delete("A");
        System.out.println("Search: " + dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

    }
}
