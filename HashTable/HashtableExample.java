import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> studentGrades = new Hashtable<>();

        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 88);
        studentGrades.put("Charlie", 92);
        studentGrades.put("Diana", 78);

        int bobGrade = studentGrades.get("Bob");
        System.out.println("Bob's Grade: " + bobGrade);

        System.out.println("All Student Grades:");
        Enumeration<String> keys = studentGrades.keys();
        while (keys.hasMoreElements()) {
            String student = keys.nextElement();
            int grade = studentGrades.get(student);
            System.out.println(student + ": " + grade);
        }
    }
}
