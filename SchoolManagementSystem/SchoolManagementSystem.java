package SchoolManagementSystem;
import java.util.Scanner;

// Student.java
class Student {
    private String name;
    private int rollNumber;
    private double[] grades;
    private boolean[] attendance;

    public Student(String name, int rollNumber, int numberOfSubjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new double[numberOfSubjects];
        this.attendance = new boolean[numberOfSubjects];
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grades: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + grades[i]);
        }
        System.out.println("Attendance: ");
        for (int i = 0; i < attendance.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + (attendance[i] ? "Present" : "Absent"));
        }
    }

    // Method to calculate the average grade
    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to mark attendance for a subject
    public void markAttendance(int subjectNumber, boolean isPresent) {
        if (subjectNumber >= 1 && subjectNumber <= attendance.length) {
            attendance[subjectNumber - 1] = isPresent;
            System.out.println("Attendance for Subject " + subjectNumber + " has been marked.");
        } else {
            System.out.println("Invalid subject number.");
        }
    }

    // Method to set grades for a subject
    public void setGrade(int subjectNumber, double grade) {
        if (subjectNumber >= 1 && subjectNumber <= grades.length) {
            grades[subjectNumber - 1] = grade;
            System.out.println("Grade for Subject " + subjectNumber + " has been set.");
        } else {
            System.out.println("Invalid subject number.");
        }
    }
}

// Main.java
public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a student with 3 subjects
        Student student = new Student("John Doe", 101, 3);

        boolean running = true;
        while (running) {
            System.out.println("\nSchool Management System:");
            System.out.println("1. Display Student Details");
            System.out.println("2. Set Grades for Subjects");
            System.out.println("3. Mark Attendance for Subjects");
            System.out.println("4. Calculate Average Grade");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    student.displayStudentDetails();
                    break;

                case 2:
                    System.out.print("Enter subject number (1-3): ");
                    int subjectNumberForGrade = scanner.nextInt();
                    System.out.print("Enter grade for Subject " + subjectNumberForGrade + ": ");
                    double grade = scanner.nextDouble();
                    student.setGrade(subjectNumberForGrade, grade);
                    break;

                case 3:
                    System.out.print("Enter subject number (1-3): ");
                    int subjectNumberForAttendance = scanner.nextInt();
                    System.out.print("Enter attendance (true for present, false for absent): ");
                    boolean isPresent = scanner.nextBoolean();
                    student.markAttendance(subjectNumberForAttendance, isPresent);
                    break;

                case 4:
                    double averageGrade = student.calculateAverageGrade();
                    System.out.println("Average Grade: " + averageGrade);
                    break;

                case 5:
                    System.out.println("Exiting the system. Thank you!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
