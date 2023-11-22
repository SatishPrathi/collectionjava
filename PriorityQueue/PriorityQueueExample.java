import java.util.PriorityQueue;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Person> personQueue = new PriorityQueue<>();

        personQueue.offer(new Person("Alice", 25));
        personQueue.offer(new Person("Bob", 30));
        personQueue.offer(new Person("Charlie", 22));

        System.out.println("Priority Queue elements:");
        for (Person person : personQueue) {
            System.out.println(person);
        }

        Person removedPerson = personQueue.poll();
        System.out.println("\nRemoved person: " + removedPerson);

        Person peekedPerson = personQueue.peek();
        System.out.println("Peeked person: " + peekedPerson);

        personQueue.remove(new Person("Bob", 30));

        System.out.println("\nRemaining elements after removal:");
        for (Person person : personQueue) {
            System.out.println(person);
        }

        int size = personQueue.size();
        System.out.println("\nSize of the queue: " + size);

        personQueue.clear();

        boolean isEmpty = personQueue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}
