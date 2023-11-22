import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new LinkedHashMap<>();

        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 88);
        studentGrades.put("Charlie", 92);
        studentGrades.put("Diana", 78);

        int bobGrade = studentGrades.get("Bob");
        System.out.println("Bob's Grade: " + bobGrade);

        System.out.println("All Student Grades (in insertion order):");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String student = entry.getKey();
            int grade = entry.getValue();
            System.out.println(student + ": " + grade);
        }
    }
}
