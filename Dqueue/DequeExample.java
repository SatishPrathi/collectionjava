import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("First");
        deque.addLast("Last");

        System.out.println("Deque: " + deque);

        String firstElement = deque.removeFirst();
        String lastElement = deque.removeLast();

        System.out.println("Removed First Element: " + firstElement);
        System.out.println("Removed Last Element: " + lastElement);

        System.out.println("Updated Deque: " + deque);
    }
}
