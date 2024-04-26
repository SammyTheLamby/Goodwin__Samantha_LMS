
/**
 * Samantha Goodwin
 * Software Development
 * January 28, 2024
 *
 * Class Name: Main
 *
 *
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a Library instance
        Library library = new Library();

        // Add books from a text file
        library.addBookFromFile("books.txt");

        // List all books in the library
        System.out.println("All books in the library:");
        library.listAllBooks();

        // Remove a book by ID
        int bookIDToRemove = 2;
        System.out.println("\nRemoving book with ID " + bookIDToRemove);
        library.removeBook(bookIDToRemove);

        // List all books after removal
        System.out.println("\nUpdated list of books in the library:");
        library.listAllBooks();

        // Remove a book by title
        String titleToRemove = "1984";
        System.out.println("\nRemoving book with title " + titleToRemove);
        library.removeBookByTitle(titleToRemove);

        // List all books after removal
        System.out.println("\nUpdated list of books in the library:");
        library.listAllBooks();

        // Check out a book
        String titleToCheckOut = "To Kill a Mockingbird";
        System.out.println("\nChecking out book with title " + titleToCheckOut);
        library.checkOutBook(titleToCheckOut);

        // List all books after check-out
        System.out.println("\nUpdated list of books in the library:");
        library.listAllBooks();

        // Check in a book
        String titleToCheckIn = "To Kill a Mockingbird";
        System.out.println("\nChecking in book with title " + titleToCheckIn);
        library.checkInBook(titleToCheckIn);

        // List all books after check-in
        System.out.println("\nUpdated list of books in the library:");
        library.listAllBooks();
    }
}
