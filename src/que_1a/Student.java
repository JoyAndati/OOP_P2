package que_1a;

public class Student {
    // Private attributes
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // Ensuring encapsulation rule is applied
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade with validation
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0; // Default value if out of range
        }
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
    }
}




