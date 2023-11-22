import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("Element 1");
        deque.addFirst("First Element");
        deque.addLast("Last Element");
        deque.offer("Another Element");

        System.out.println("Deque after adding elements: " + deque);

        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        String removedElement = deque.remove();
        String removedFirst = deque.removeFirst();
        String removedLast = deque.removeLast();

        System.out.println("Removed Element: " + removedElement);
        System.out.println("Deque after removal: " + deque);

        System.out.println("Size of the deque: " + deque.size());
        System.out.println("Is the deque empty? " + deque.isEmpty());

        deque.clear();
        System.out.println("Deque after clearing: " + deque);
    }
}
