import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("LinkedList after adding elements: " + linkedList);

        linkedList.add(1, "Orange");
        System.out.println("LinkedList after adding at index 1: " + linkedList);

        String fruit = linkedList.get(2);
        System.out.println("Element at index 2: " + fruit);

        linkedList.remove("Banana");
        System.out.println("LinkedList after removing 'Banana': " + linkedList);

        linkedList.remove(1);
        System.out.println("LinkedList after removing element at index 1: " + linkedList);

        System.out.println("Iterating over LinkedList:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is the LinkedList empty? " + isEmpty);

        linkedList.clear();
        System.out.println("LinkedList after clearing all elements: " + linkedList);

        linkedList.add("Grapes");
        linkedList.add("Mango");

        int index = linkedList.indexOf("Mango");
        System.out.println("Index of 'Mango': " + index);
    }
}
