import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap with natural ordering
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        treeMap.put(4, "D");

        // Displaying the TreeMap
        System.out.println("TreeMap (Natural Ordering): " + treeMap);

        // Retrieving values
        String valueForKey2 = treeMap.get(2);
        System.out.println("Value for Key 2: " + valueForKey2);

        // Iterating through key-value pairs
        System.out.println("All Key-Value Pairs:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
