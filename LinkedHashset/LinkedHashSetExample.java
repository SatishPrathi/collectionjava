import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        System.out.println("LinkedHashSet: " + linkedHashSet);

        linkedHashSet.add("Apple");

        linkedHashSet.remove("Banana");

        boolean containsOrange = linkedHashSet.contains("Orange");
        System.out.println("Contains Orange? " + containsOrange);

        int size = linkedHashSet.size();
        System.out.println("Size of LinkedHashSet: " + size);

        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("Is LinkedHashSet empty? " + isEmpty);

        linkedHashSet.clear();

        isEmpty = linkedHashSet.isEmpty();
        System.out.println("Is LinkedHashSet empty after clearing? " + isEmpty);
    }
}
