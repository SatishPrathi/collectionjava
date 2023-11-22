import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("Apple");
        sortedSet.add("Banana");
        sortedSet.add("Orange");

        System.out.println("SortedSet: " + sortedSet);

        sortedSet.add("Apple");

        sortedSet.remove("Banana");

        boolean containsOrange = sortedSet.contains("Orange");
        System.out.println("Contains Orange? " + containsOrange);

        int size = sortedSet.size();
        System.out.println("Size of SortedSet: " + size);

        boolean isEmpty = sortedSet.isEmpty();
        System.out.println("Is SortedSet empty? " + isEmpty);

        sortedSet.clear();

        isEmpty = sortedSet.isEmpty();
        System.out.println("Is SortedSet empty after clearing? " + isEmpty);

        sortedSet.add("Cherry");
        sortedSet.add("Grapes");
        sortedSet.add("Banana");
        sortedSet.add("Apple");

        System.out.println("SortedSet after adding elements again: " + sortedSet);

        String firstElement = sortedSet.first();
        String lastElement = sortedSet.last();

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}
