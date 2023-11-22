import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        String topItem = stack.peek();
        System.out.println("Top item: " + topItem);

        String poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);

        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty);

        int position = stack.search("Banana");
        System.out.println("Position of Banana: " + position);
    }
}
