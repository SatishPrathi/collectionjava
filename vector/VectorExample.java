import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();

        stringVector.add("Element 1");
        stringVector.add("Element 2");
        stringVector.add("Element 3");

        String element = stringVector.get(1);
        System.out.println("Element at index 1: " + element);

        System.out.println("Vector elements:");
        for (String e : stringVector) {
            System.out.println(e);
        }

        stringVector.remove("Element 2");

        int size = stringVector.size();
        System.out.println("Vector size: " + size);

        boolean isEmpty = stringVector.isEmpty();
        System.out.println("Is Vector empty? " + isEmpty);
    }
}
