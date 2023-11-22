import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        System.out.println("HashSet: " + hashSet);

        hashSet.add("Apple");

        hashSet.remove("Banana");

        boolean containsOrange = hashSet.contains("Orange");
        System.out.println("Contains Orange? " + containsOrange);

        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);

        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);

        hashSet.clear();

        isEmpty = hashSet.isEmpty();
        System.out.println("Is HashSet empty after clearing? " + isEmpty);
    }
}
