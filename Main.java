/**
 * Samantha Goodwin
 * Software Development
 * January 28, 2024
 *
 * Class Name: Main
 * 
 * This class represents what the user will see when interacting with the LMS.
 * It contains printed prompts to show the user.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Library instance
        Library library = new Library();

        // Prompt user for file name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        // Add books from the specified file
        library.addBookFromFile(fileName);

        // Print all books in the library
        System.out.println("\nAll books in the library:");
        library.listAllBooks();

        // Remove a book by ID
        System.out.print("\nEnter the ID of the book to remove: ");
        int bookIDToRemove = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Removing book with ID " + bookIDToRemove);
        library.removeBook(bookIDToRemove);

        // Print updated list of books
        System.out.println("\nUpdated list of books in the library:");
        library.listAllBooks();

        // Remove a book by title
        System.out.print("\nEnter the title of the book to remove: ");
        String titleToRemove = scanner.nextLine();
        System.out.println("Removing book with title: " + titleToRemove);
        library.removeBookByTitle(titleToRemove);

        // Print updated list of books
        System.out.println("\nUpdated list of books in the library:");
        library.listAllBooks();

        // Check out a book
        System.out.print("\nEnter the title of the book to check out: ");
        String titleToCheckOut = scanner.nextLine();
        System.out.println("Checking out book with title: " + titleToCheckOut);
        library.checkOutBook(titleToCheckOut);

        // Print updated list of books
        System.out.println("\nUpdated list of books in the library:");
        library.listAllBooks();

        // Check in a book
        System.out.print("\nEnter the title of the book to check in: ");
        String titleToCheckIn = scanner.nextLine();
        System.out.println("Checking in book with title: " + titleToCheckIn);
        library.checkInBook(titleToCheckIn);

        // Print updated list of books
        System.out.println("\nUpdated list of books in the library:");
        library.listAllBooks();

        // Close scanner
        scanner.close();
    }
}
