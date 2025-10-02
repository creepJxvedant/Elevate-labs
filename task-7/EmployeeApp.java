import java.sql.*;
import java.util.Scanner;

public class EmployeeApp {
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";
    private static final String PASS = "my-password";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Employee Database App ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addEmployee(sc);
                case 2 -> viewEmployees();
                case 3 -> updateEmployee(sc);
                case 4 -> deleteEmployee(sc);
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addEmployee(Scanner sc) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "INSERT INTO employees(name, department, salary) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter name: ");
            ps.setString(1, sc.nextLine());

            System.out.print("Enter department: ");
            ps.setString(2, sc.nextLine());

            System.out.print("Enter salary: ");
            ps.setDouble(3, sc.nextDouble());

            ps.executeUpdate();
            System.out.println("Employee added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void viewEmployees() {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

            System.out.println("\n--- Employee Records ---");
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Dept: %s | Salary: %.2f%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateEmployee(Scanner sc) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "UPDATE employees SET name=?, department=?, salary=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter Employee ID: ");
            ps.setInt(4, sc.nextInt());
            sc.nextLine();

            System.out.print("Enter new name: ");
            ps.setString(1, sc.nextLine());

            System.out.print("Enter new department: ");
            ps.setString(2, sc.nextLine());

            System.out.print("Enter new salary: ");
            ps.setDouble(3, sc.nextDouble());

            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println("Employee updated successfully!");
            else System.out.println("⚠ Employee not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteEmployee(Scanner sc) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String sql = "DELETE FROM employees WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter Employee ID: ");
            ps.setInt(1, sc.nextInt());

            int rows = ps.executeUpdate();
            if (rows > 0) System.out.println(" Employee deleted successfully!");
            else System.out.println("⚠ Employee not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
