import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<String> navigableSet = new TreeSet<>();

        navigableSet.add("Apple");
        navigableSet.add("Banana");
        navigableSet.add("Orange");

        System.out.println("NavigableSet: " + navigableSet);

        navigableSet.add("Apple");

        navigableSet.remove("Banana");

        boolean containsOrange = navigableSet.contains("Orange");
        System.out.println("Contains Orange? " + containsOrange);

        int size = navigableSet.size();
        System.out.println("Size of NavigableSet: " + size);

        boolean isEmpty = navigableSet.isEmpty();
        System.out.println("Is NavigableSet empty? " + isEmpty);

        navigableSet.clear();

        isEmpty = navigableSet.isEmpty();
        System.out.println("Is NavigableSet empty after clearing? " + isEmpty);

        navigableSet.add("Cherry");
        navigableSet.add("Grapes");
        navigableSet.add("Banana");
        navigableSet.add("Apple");

        System.out.println("Navigating elements:");
        System.out.println("First element: " + navigableSet.first());
        System.out.println("Last element: " + navigableSet.last());
        System.out.println("Floor element of 'Banana': " + navigableSet.floor("Banana"));
        System.out.println("Ceiling element of 'Banana': " + navigableSet.ceiling("Banana"));
        System.out.println("Lower element of 'Banana': " + navigableSet.lower("Banana"));
        System.out.println("Higher element of 'Banana': " + navigableSet.higher("Banana"));

        String firstElement = navigableSet.pollFirst();
        String lastElement = navigableSet.pollLast();

        System.out.println("First element (removed): " + firstElement);
        System.out.println("Last element (removed): " + lastElement);

        System.out.println("NavigableSet after navigation: " + navigableSet);
    }
}
