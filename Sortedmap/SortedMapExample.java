import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        // Creating a SortedMap (TreeMap)
        SortedMap<String, Integer> grades = new TreeMap<>();

        // Adding key-value pairs
        grades.put("Alice", 95);
        grades.put("Bob", 88);
        grades.put("Charlie", 92);
        grades.put("Diana", 78);

        // Displaying the SortedMap
        System.out.println("SortedMap (Natural Ordering): " + grades);

        // Retrieving values
        int valueForKeyBob = grades.get("Bob");
        System.out.println("Bob's Grade: " + valueForKeyBob);

        // Using SortedMap methods
        System.out.println("First Key: " + grades.firstKey());
        System.out.println("Last Key: " + grades.lastKey());

        // Submap with keys from "Bob" (inclusive) to "Diana" (exclusive)
        SortedMap<String, Integer> subMap = grades.subMap("Bob", "Diana");
        System.out.println("SubMap: " + subMap);
    }
}
