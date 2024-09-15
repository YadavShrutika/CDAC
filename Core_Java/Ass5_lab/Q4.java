//4)	Build a class Student which contains details about the Student and compile and run its instance.

// Student class definition
class Student {
    // Attributes of the Student class
    private String name;
    private int age;
    private String course;
    private String studentID;

    // Constructor to initialize Student object
    public Student(String name, int age, String course, String studentID) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.studentID = studentID;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Getter method for course
    public String getCourse() {
        return course;
    }

    // Getter method for studentID
    public String getStudentID() {
        return studentID;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentID);
    }
}

// Main class to create and run the Student instance
public class Q4 {
    public static void main(String[] args) {
        // Create a Student object and initialize it
        Student student1 = new Student("Shrutika", 24, "CDAC", "240840320104");

        // Call method to display student details
        student1.displayDetails();
    }
}


// PS D:\CoreJava\Assignment\Assignment5_lab> javac Q4.java
// PS D:\CoreJava\Assignment\Assignment5_lab> java Q4      
// Student Details:
// Name: Shrutika
// Age: 24
// Course: CDAC
// Student ID: 240840320104