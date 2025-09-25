import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Show Books");
            System.out.println("4. Show Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    library.addBook(new Book(id, title));
                }
                case 2 -> {
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(id, name));
                }
                case 3 -> library.showBooks();
                case 4 -> library.showUsers();
                case 5 -> {
                    System.out.print("Enter Book ID to issue: ");
                    int id = sc.nextInt();
                    library.issueBook(id);
                }
                case 6 -> {
                    System.out.print("Enter Book ID to return: ");
                    int id = sc.nextInt();
                    library.returnBook(id);
                }
                case 7 -> {
                    running = false;
                    System.out.println("Exiting Library System. Goodbye!");
                }
                default -> System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
