package HashTableExamples;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        // Hashtable is a data structure that stores unique keys to values
        // Each key/value pair is know as an Entry
        // Not ideal for small data sets, great with large data sets

        // hashing takes a key and computes an integer
        // In a Hashtable, we use the hash % capacity to calculate an index number

        // bucket is and indexed storage location for one or more Entries
        // can store multiple Entries in case of a collision

        // collision is has function generates the same index for more than one key
        // less collisions mean more efficiency

        // Runtime complexity: Best case O(1)
        //                     Worst case O(n)

        // processTestWithIntegerKey();
        processTestWithStringKey();

    }

    private static void processTestWithStringKey() {

        Hashtable<String, String> table = new Hashtable<>(10);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        // table.remove(777);

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t"+ table.get(key));
        }
    }

    private static void processTestWithIntegerKey() {
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        // table.remove(777);

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t"+ table.get(key));
        }
    }
}
