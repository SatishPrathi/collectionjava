import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        treeMap.put(4, "D");

        System.out.println("NavigableMap (Natural Ordering): " + treeMap);

        System.out.println("Ceiling Entry for Key 2: " + treeMap.ceilingEntry(2));
        System.out.println("Floor Entry for Key 2: " + treeMap.floorEntry(2));
        System.out.println("Higher Entry for Key 2: " + treeMap.higherEntry(2));
        System.out.println("Lower Entry for Key 2: " + treeMap.lowerEntry(2));

        System.out.println("Poll First Entry: " + treeMap.pollFirstEntry());
        System.out.println("Poll Last Entry: " + treeMap.pollLastEntry());

        System.out.println("NavigableMap after Polling: " + treeMap);
    }
}
