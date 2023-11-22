import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");

        System.out.println("TreeSet: " + treeSet);

        treeSet.add("Apple");

        treeSet.remove("Banana");

        boolean containsOrange = treeSet.contains("Orange");
        System.out.println("Contains Orange? " + containsOrange);

        int size = treeSet.size();
        System.out.println("Size of TreeSet: " + size);

        boolean isEmpty = treeSet.isEmpty();
        System.out.println("Is TreeSet empty? " + isEmpty);

        treeSet.clear();

        isEmpty = treeSet.isEmpty();
        System.out.println("Is TreeSet empty after clearing? " + isEmpty);
    }
}
