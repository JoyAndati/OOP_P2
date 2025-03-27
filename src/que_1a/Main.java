package que_1a;

public class Main {
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Alice", 85);
        student1.displayStudent();

        Student student2 = new Student("Bob", 110); // Invalid grade, should be 0
        student2.displayStudent();
    }
}
