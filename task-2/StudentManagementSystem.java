import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Marks: ");
        double marks = sc.nextDouble();
        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                System.out.print("Enter new marks: ");
                double marks = sc.nextDouble();
                s.setName(name);
                s.setMarks(marks);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Student Record Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                }
                default -> System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
