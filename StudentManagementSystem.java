import java.util.Scanner;

class Student {
    String name;
    int rollNo;
}

public class StudentManagementSystem {

    static Student[] students = new Student[100]; // fixed size
    static int count = 0; // number of students
    static Scanner sc = new Scanner(System.in);

    // Add student
    static void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.next();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        students[count] = new Student();
        students[count].name = name;
        students[count].rollNo = roll;
        count++;

        System.out.println("Student added successfully.");
    }

    // Remove student by roll number
    static void removeStudent() {
        System.out.print("Enter roll number to remove: ");
        int roll = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].rollNo == roll) {
                // Shift elements
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                count--;
                found = true;
                System.out.println("Student removed successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // Display students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("\nStudent List:");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + students[i].name +
                               ", Roll No: " + students[i].rollNo);
        }
    }

    // Main method
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
