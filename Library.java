/**
 * Samantha Goodwin
 * Software Development
 * January 28, 2024
 *
 * Class Name: Library
 *
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addBookFromFile(String filePath) {
        // Implementation for adding books from a file
    }

    public void removeBook(int bookID) {
        // Implementation for removing a book by ID
    }

    public void removeBookByTitle(String title) {
        // Implementation for removing a book by title
    }

    public void checkOutBook(String title) {
        // Implementation for checking out a book
    }

    public void checkInBook(String title) {
        // Implementation for checking in a book
    }

    public void listAllBooks() {
        // Implementation for listing all books
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBookByTitle(String title) {
        // Implementation for getting a book by title
        return null;
    }
}
