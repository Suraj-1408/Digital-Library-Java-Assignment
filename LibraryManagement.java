import java.util.Scanner;



//main class
public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability Status (Available/Checked Out): ");
                    String status = scanner.nextLine();
                    library.addBook(bookId, title, author, genre, status);
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID or Title to search: ");
                    String keyword = scanner.nextLine();
                    library.searchBook(keyword);
                    break;
                case 4:
                    System.out.print("Enter Book ID to update: ");
                    bookId = scanner.nextLine();
                    System.out.print("Enter new Title (or press Enter to skip): ");
                    title = scanner.nextLine();
                    System.out.print("Enter new Author (or press Enter to skip): ");
                    author = scanner.nextLine();
                    System.out.print("Enter new Genre (or press Enter to skip): ");
                    genre = scanner.nextLine();
                    System.out.print("Enter new Status (Available/Checked Out, or press Enter to skip): ");
                    status = scanner.nextLine();
                    library.updateBook(bookId, title, author, genre, status);
                    break;
                case 5:
                    System.out.print("Enter Book ID to delete: ");
                    bookId = scanner.nextLine();
                    library.deleteBook(bookId);
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
